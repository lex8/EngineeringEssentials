
package resources;

import pojo.*;
import utility.*;

import javax.ws.rs.*;
import java.io.*;
import java.util.*;
import java.text.*;

import static utility.FileHelper.DATEFORMAT;
/**
 * Copyright 2019 Goldman Sachs.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package resources;

@Path("stock")
public class StockResource {

    @GET
    @Path("ticker/{ticker}/startDate/{startDate}/endDate/{endDate}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStockData(@PathParam("ticker") Ticker ticker, @PathParam("startDate") String startDateStr, @PathParam("endDate") String endDateStr) throws IOException{

        Ticker ticker=ticker;
        Date startDate=DATEFORMAT.parse(startDateStr);
        Date endDate=DATEFORMAT.parse(endDateStr);

        List<Stock> stocks=InputValidator.readAllStock("caseStudy/services/src/main/resources/data/historicalStockData.json");
        Stock particularStock = new Stock;

        for (Stock stock: stocks) {
            if ((stock.ticker().equals(ticker))) {
                particularStock = stock;
            }
        }

        TreeMap<Date, double> pricesInRange=new TreeMap<Date, double>();
        for ( : particularStock){
            if ((stock.getDate().before(endDate) || stock.getDate().equals(endDate)) && (stock.getDate().after(startDate) || stock.getDate().equals(startDate))){
                pricesInRange.add(stock);
            }
        }
        Response.ResponseBuilder response;
        if (pricesInRange.size() > 0) {
            return Response.ok(pricesInRange).build();
        } else {
            return Response.ok().entity("No matches found for Date with Company " + ticker).build();
        }
        } catch (Exception e) {
            response = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e);
        }
        return response.build();
        
    }