/*
 *  Copyright (c) 2017, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package org.wso2.ballerina.lang.statements;

import org.testng.annotations.Test;
import org.wso2.ballerina.core.utils.ParserUtils;

/**
 * Tests covering package imports.
 */
public class PackageImportTest {

    /*
     * Negative tests
     */
    
    @Test(expectedExceptions = {RuntimeException.class },
            expectedExceptionsMessageRegExp = "Duplicate import package declaration: ballerina.lang.system "
                    + "in duplicate-import.bal:4")
    public void testDuplicatePackageImports() {
        ParserUtils.parseBalFile("lang/statements/duplicate-import.bal");
    }
    

}
