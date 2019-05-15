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

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This class will define a company and its attributes
 * Look at resources/data/companyInfo.json
 */
public class Company {

    @JsonProperty
    private Ticker symbol;
    @JsonProperty
    private String name;
    @JsonProperty
    private String headquartersCity;
    @JsonProperty
    private String headquartersStateorCountry;
    @JsonProperty
    private int numberOfEmployees;
    @JsonProperty
    private String sector;
    @JsonProperty
    private String industry;

    public Ticker getSymbol(){
        return symbol;
    }

    private void setSymbol(Ticker symbol){
        this.symbol=symbol;
    }

    public String getName(){
        return name;
    }

    private void setName(String name){
        this.name=name;
    }

    public String getHeadquartersCity(){
        return headquartersCity;
    }

    private void setHeadquartersCity(String headquartersCity){
        this.headquartersCity=headquartersCity;
    }

    public String getHeadquartersStateorCountry(){
        return headquartersStateorCountry;
    }

    private void setHeadquartersStateorCountry(String headquartersStateorCountry){
        this.headquartersStateorCountry=headquartersStateorCountry;
    }

    public int getNumberOfEmployees(){
        return numberOfEmployees;
    }

    private void setNumberOfEmployees(int numberOfEmployees){
        this.numberOfEmployees=numberOfEmployees;
    }

    public String getSector(){
        return sector;
    }

    private void setSector(String sector){
        this.sector=sector;
    }

    public String getIndustry(){
        return industry;
    }

    private void setIndustry(String industry){
        this.industry=industry;
    }

}
