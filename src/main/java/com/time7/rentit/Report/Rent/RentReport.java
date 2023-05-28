package com.time7.rentit.Report.Rent;

import com.time7.rentit.Entity.Rent;
import com.time7.rentit.Prompts.Prompts;
import com.time7.rentit.Service.Rent.RentService;
import htmlflow.HtmlFlow;
import htmlflow.HtmlPage;
import htmlflow.HtmlView;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xhtmlrenderer.resource.FSEntityResolver;

/**
 *
 * @author Paulo Henrique
 */
public class RentReport {
    
    static HtmlView tasksTableView = HtmlFlow.view(RentReport::rentReportTemplate);
    static List<Rent> rents = populateRents();
    
    private static List<Rent> populateRents() {
        try {
            return RentService.getInstance().getRents();
        } catch (Exception e) {
            Prompts.promptError(null, e);
        }
        return new ArrayList<>();
    }
    
    private static void rentReportTemplate(HtmlPage page) {        
        page.html()
            .head().style().text("""
                                * { font-family: 'Arial Unicode MS'; }
                                .table  {border-collapse:collapse;border-spacing:0;}
                                .table td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
                                   overflow:hidden;padding:10px 5px;word-break:normal;}
                                 .table th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
                                   font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
                                 .table .table-head{border-color:inherit;text-align:left;vertical-align:top}""")
                   .__() // style
            .__() // head
        .body()
            .div().attrClass("container")
                  .h1().text("Relatorio de Locações").__()
                  .table().attrClass("table")
                    .thead().tr()
                               .th().attrClass("table-head").text("ID").__()
                               .th().attrClass("table-head").text("Funcionário").__()
                               .th().attrClass("table-head").text("Cliente").__()
                               .th().attrClass("table-head").text("Veículo").__()
                               .th().attrClass("table-head").text("Início").__()
                               .th().attrClass("table-head").text("Final").__()
                               .th().attrClass("table-head").text("Esperado").__()
                               .th().attrClass("table-head").text("Valor").__()
                               .th().attrClass("table-head").text("Status").__()
                          .__() // tr
                    .__() // thead
                  .tbody().dynamic((tbody, re) ->
                          rents.forEach(r -> 
                                  tbody.tr()
                                          .td().text(r.getId()).__()
                                          .td().text(r.getEmployeeId()).__()
                                          .td().text(r.getClientId()).__()
                                          .td().text(r.getVehicleId()).__()
                                          .td().text(treatData(r.getRentStartDt())).__()
                                          .td().text(treatData(r.getRentEndDt())).__()
                                          .td().text(treatData(r.getRentExpectedEndDt())).__()
                                          .td().text(r.getRentValue()).__()
                                          .td().text(r.getRentStatusLabel()).__()
                                       .__() // tr
                          ) // forEach
                          ) // dynamic
                  .__() // tbody
                  .__() // table
                .__() // div
            .__() // body
        .__(); // html
    }

    private static String treatData(Date date) {
        return date == null ? "" : date.toString();
    }
    
    public static void generateReport() throws Exception {
        generatePDF();
    }
    
    private static void generatePDF() throws Exception {
        File output = new File("Report.pdf");
        
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        documentBuilderFactory.setValidating(false);
        
        DocumentBuilder builder = documentBuilderFactory.newDocumentBuilder();
        builder.setEntityResolver(FSEntityResolver.instance());
        
        org.w3c.dom.Document document = builder.parse(new ByteArrayInputStream(tasksTableView.render()
                                                                                             .getBytes("UTF-8")));

        ITextRenderer renderer = new ITextRenderer();
        renderer.setDocument(document, null);
        renderer.layout();
        renderer.createPDF(new FileOutputStream(output));
    }
}