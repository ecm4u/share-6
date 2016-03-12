/**
 * Copyright (C) 2005-2009 Alfresco Software Limited.
 *
 * This file is part of the Spring Surf Extension project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.extensions.surf.resource;

import java.io.IOException;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.springframework.extensions.surf.FrameworkBean;

/**
 * XML Content for a Resource
 *  
 * @author muzquiano
 */
public interface ResourceXMLContent extends ResourceContent
{   
    /**
     * Gets the xml for a resource
     * 
     * @return the xml
     */
    public String getXml() throws IOException;
    
    /**
     * Gets the document.
     * 
     * @return the document
     */
    public Document getDocument() throws DocumentException, IOException;
}