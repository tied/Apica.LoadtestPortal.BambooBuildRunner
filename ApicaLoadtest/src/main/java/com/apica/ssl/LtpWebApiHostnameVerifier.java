/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apica.ssl;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 *
 * @author andras.nemes
 */
public class LtpWebApiHostnameVerifier implements ISslHostnameVerifier
{

    @Override
    public HostnameVerifier hostnamesToTrust()
    {
        /*
        return (String hostname, SSLSession session) ->
        {
            return true;
        };*/
        return new HostnameVerifier()
        {
            public boolean verify(String string, SSLSession ssls)
            {
                return true;
            }
        };
        
    }
}
