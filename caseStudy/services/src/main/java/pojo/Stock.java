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

package pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.*;
import java.io.*;


/**
 * This class will define a company's end-of-day stock price
 * Look at resources/data/historicalStockData.json
 */
public class Stock {

    // TODO - Think back to your modelling session
    // Define the attributes of a stock price based on the
    // provided data in resources/data

    // TODO - add getter and setter methods for your attributes
    @JsonProperty
    private Ticker ticker;
    @JsonProperty
    private TreeMap<Date, Double> dailyClosePrice;
    
    // public TreeMap<Date, Double> getDailyClosePrice() {
    //     return dailyClosePrice;
    // }
    public Ticker getTicker() {
        return ticker;
    }

    public Map<Date, Double> getDailyClosePrice(){
        return dailyClosePrice;
    }

    public Set<Date> getDate(){
        HashSet<Date> dates=dailyClosePrice.keySet();
        return dates;
    }

    public List<Double> getPrice(){
        ArrayList<Double> prices=dailyClosePrice.values();
        return prices;
    }

    //return dates and associated prices
    // public TreeSet<Date> getDate(){
    //     Set<Date> dates=dailyClosePrice.keySet();
    //     return dates;
    // }

    //public 

    // public void setTicker(Ticker ticker) {
    //      this.ticker = ticker;
    // }
    // public void setDailyClosePrice(DailyClosePrice[] dailyClosePrice) {
    //     this.dailyClosePrice = dailyClosePrice;
    // }
}

