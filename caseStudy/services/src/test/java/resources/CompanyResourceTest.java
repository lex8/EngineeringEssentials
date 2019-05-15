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
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.*; //////////////////////////
import resources.*; ///////////////////////////
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;
import utility.InputValidator;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utility.InputValidator.DATEFORMAT;
/**
 * Write your tests for the Company Resource here
 */
public class CompanyResourceTest {

    // TODO - write a test for each method in the CompanyResource class
    // Think about both positive and negative test cases:
    // What happens if no inputs are passed?
    // What happens if the input is null?
    private static ObjectMapper mapper = new ObjectMapper();

    public void testGetCompanyInfo() {
        List<Company> apple = target().path("/services/company/AAPL").request().get(List.class);
        String other = target().path("/services/company/random").request().get(String.class);

        assertEquals("Apple Inc.", apple.getName());
        assertEquals("Cupertino", apple.getHeadquartersCity());
        assertEquals("CA", apple.getHeadquartersStateorCountry());
        assertEquals(116000, apple.getNumberOfEmployees());
        assertEquals("Technology", apple.getSector());
        assertEquals("Semiconductor Machinery Manufacturing", apple.getIndustry());
        assertEquals(other, "No matches for a company called random")
    }


}
