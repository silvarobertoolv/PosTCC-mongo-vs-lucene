/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jayway.mongodb;

import java.io.IOException;
import java.net.UnknownHostException;

/**
 *
 * @author roliveira
 */
public class Main {
    
       public static void main(String[] args) throws UnknownHostException, IOException{
           
          MongoAnalysis mgdb = new MongoAnalysis();
          
          mgdb.setup();
          mgdb.verifySaveAndGetTestSearchWithAll();
           
       }
    
}
