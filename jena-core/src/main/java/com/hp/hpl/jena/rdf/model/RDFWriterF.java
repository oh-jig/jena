/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hp.hpl.jena.rdf.model;

/** An RDFReader factory inferface.
 *
 * <p>The factory will create an appropriate writer for the particular
 *   serialization language being read.  Predefined languages include:</p>
 * <ul>
 * <li>RDF/XML - default</li>
 * <li>RDF/XML-ABBREV</li>
 * <li>N-TRIPLE</li>
 * <li>N3</li>
 * </ul>
 *<p>System wide defaults for classes to use as readers for these languages
 *are defined.  These defaults may be overwridden by setting a system property
 *with a name of the form com.hp.hpl.jena.readers.<lang> to the class
 *name.</p>
 */

public interface RDFWriterF {
    
/** return an RDFWriter instance for the default serialization language.
 * @return an RDFWriter instance for the default serialization language.
 */    
    public RDFWriter getWriter();
    
/** an RDFWriter instance for the specified serialization language.
 * @param lang the serialization langauge - <code>null</code> selects the
 *             default
 * @return the RDFWriter instance
 */    
    public RDFWriter getWriter(String lang); 
    
/** set the class name for the RDFWriter for a langauge
 * @param lang the language for which this class should be used
 * @param className the class name for writers for this language
 * @return the old class name for this language
 */    
    public String setWriterClassName(String lang, String className);
}