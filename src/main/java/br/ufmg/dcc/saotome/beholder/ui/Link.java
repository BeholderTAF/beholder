/*  Copyright 2014 Ícaro Clever da Fonseca Braga

	Licensed to the Apache Software Foundation (ASF) under one
	or more contributor license agreements.  See the NOTICE file
	distributed with this work for additional information
	regarding copyright ownership.  The ASF licenses this file
	to you under the Apache License, Version 2.0 (the
	"License"); you may not use this file except in compliance
	with the License.  You may obtain a copy of the License at
	
	  http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing,
	software distributed under the License is distributed on an
	"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
	KIND, either express or implied.  See the License for the
	specific language governing permissions and limitations
	under the License.
 */
package br.ufmg.dcc.saotome.beholder.ui;

import br.ufmg.dcc.saotome.beholder.ui.event.Clickable;

/** This class represents the hyperlink component of HTML.
 * Hyperlinks are modeled in HTML with the tag &lt;a&gt;.
 * @author icaroclever
 */
public interface Link extends Component, Clickable{

    /** Get the hypertext reference (href) attribute of the component
     * loaded in the interface.
     * @return value of href attribute.
     */
    String getHypertextReference();
	
    /** Load the interface element using the attribute <b>href</b>
     * as the unique identifier, overwriting the old object by the
     * new one loaded.
     * @param url the attribute href value
     */
    void loadByHypertextReference(String url);
}
