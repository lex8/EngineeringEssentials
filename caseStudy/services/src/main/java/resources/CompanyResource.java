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
import data.companyinfo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
// TODO - add your @Path here
@Path("service")
public class CompanyResource {

    // TODO - Add a @GET resource to get company data
    @GET
    @Path("company")
    @Producess(MediaType.APPLICARION_JSON)
    public Response getCompanyInfo() throws IOException {
        
        Company ticker = null;
        return Response.ok().entity(ticker).build();
    }

    // Your service should return data for a given stock ticker

}