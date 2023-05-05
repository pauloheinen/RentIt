package com.time7.rentit.Schemas;

import com.time7.rentit.Entity.Vehicle;
import com.time7.rentit.Fetchers.Fetcher;
import com.time7.rentit.Fetchers.VehicleFetcher;

/**
 *
 * @author Paulo Henrique
 */
public class Schema {
    
    public static final class Vehicles {
        public static Vehicles alias( String s ) {
            return new Vehicles( s );
        }

        public static final class Columns {
            public final String ID;
            public final String VEHICLE_BRAND;
            public final String VEHICLE_MODEL;
            public final String VEHICLE_YEAR;
            public final String VEHICLE_PLATE;
            public final String TYPE;
            public final String STATUS;

            private Columns( String alias ) {
                ID =            alias + ".id";
                VEHICLE_BRAND = alias + ".vehicle_brand";
                VEHICLE_MODEL = alias + ".vehicle_model";
                VEHICLE_YEAR  = alias + ".vehicle_year";
                VEHICLE_PLATE = alias + ".vehicle_plate";
                TYPE =          alias + ".type";
                STATUS =        alias + ".status";
            }

            @Override
            public String toString() {
                
            return ID            + "," +
                   VEHICLE_BRAND + "," +
                   VEHICLE_MODEL + "," +
                   VEHICLE_YEAR  + "," +
                   VEHICLE_PLATE + "," +
                   TYPE          + "," +
                   STATUS        ;
            }
        }
        
        private static final String TABLE_NAME = "vehicles";

        public static final Vehicles table = new Vehicles( null );

        public static final Fetcher<Vehicle> fetcher = new VehicleFetcher();

        public final String name;
        public final String alias;

        public final Columns columns;

        public final String select;

        private Vehicles( String aliasName ) {
            this.alias = aliasName != null ? TABLE_NAME + " " + aliasName : TABLE_NAME;

            this.name = aliasName != null ? aliasName : TABLE_NAME;

            this.columns = new Columns( name );

            this.select = "select " + columns + " from " + name;
        }

        @Override
        public String toString() {
            return name;
        }
   }
}
