package com.time7.rentit.Fetchers;

import com.time7.rentit.Schemas.QueryResult;

/**
 *
 * @author Paulo Henrique
 */
public abstract class AbstractFetcher<T>
    implements
        Fetcher<T>
{
    /**
     * who extends need to override
     */
    @Override
    public T fetch( QueryResult qr ) throws Exception
    {
        return fetch( qr );
    }
}