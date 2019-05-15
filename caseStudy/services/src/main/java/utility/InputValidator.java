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

package utility;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Event;
import model.Team;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.List;
/**
 * Utility class to validate inputs
 */
public class InputValidator {

    public static final SimpleDateFormat DATEFORMAT = new SimpleDateFormat("mm/dd/yyyy");
    private static final ObjectMapper mapper = new ObjectMapper();

    public static List<Stock> readAllStock(String fileName) throws IOException {

        InputStream inputStream = new FileInputStream((fileName));
//        InputStream resourceAsStream = FileHelper.class.getClassLoader().getResourceAsStream(fileName);
        return mapper.readValue(inputStream, new TypeReference<List<Stock>>() {
        });
    }
    public static List<Company> readAllCompany(String fileName) throws IOException {

        InputStream inputStream = new FileInputStream((fileName));
//        InputStream resourceAsStream = FileHelper.class.getClassLoader().getResourceAsStream(fileName);
        return mapper.readValue(inputStream, new TypeReference<List<Company>>() {
        });
    }
    // TODO - write a method that will validate your JSON input files

    // TODO - write a method that will validate the inputs to the Company Resource
    
    // TODO - write a method that will validate the inputs to the Stock Resource

}
