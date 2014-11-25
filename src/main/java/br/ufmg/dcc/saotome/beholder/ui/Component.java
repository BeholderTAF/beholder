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

import java.util.List;

import br.ufmg.dcc.saotome.beholder.ui.event.Displayable;

/** Interface with the common attributes and events usually found in HTML 
 * components.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 */
public interface Component extends Displayable{

   /** Load the interface element using the attribute <b>id</b>
     * as the unique identifier, overwriting the old object by the
     * new one loaded.
     * @param value the attribute id value
     */
    void loadById(String value);

   /** Recover the value present in the interface of <b>id</b> attribute.
     * @return attribute id value.
     */
    String getId();
    
    /** Set the attribute <b>id</b> of the component class.
     * @param value attribute id value.
     */
    void setId(String value);

    /** Load the interface element using the attribute <b>xpath</b>
     * as the unique identifier, overwriting the old object by the
     * new one loaded.
     * @param value the attribute id value
     */
    void loadByXPath(String value);
    
    /** Recover the value present in the interface of <b>xpath</b> attribute.
     * @return attribute xpath value.
     */
    String getXPath();
    
    
    /** Set the attribute <b>xpath</b> of the component class.
     * @param value attribute id value
     */
    void setXPath(String value);
    
    /** Load the interface element using the attribute <b>name</b>
     * as the unique identifier, overwriting the old object by the
     * new one loaded.
     * @param value the attribute name value
     */
    void loadByName(String value);

    /** Recover the attribute <b>name</b> of HTML component.
     * @return attribute name value
     */
    String getName();
    
    /** Set the attribute <b>name</b> of the component class.
     * @param value attribute name value
     */
    void setName(String value);

    
    /** Load the interface element using an attribute 
     * as the unique identifier of a tag, overwriting the old object by the
     * new one loaded. If the attribute is not unique, it loads
     * the first match.
     * @param tagName the tag name
     * @param attributeName the attribute name
     * @param value the attribute name value
     */
    void loadByAttribute(String tagName, String attributeName,String value);
    
    /** Recover the attribute of HTML component.
     * @return attribute value if the attribute is found in html tag. Otherwise returns null.
     */
    String getAttribute(String attribute);
    
    /** Set the attribute of the component class.
     * @param value attribute value
     */
    void setAttribute(String attribute,String value);
    
    
   
    /**
     * 
     * Load one list of the components with  same tag, attribute and value.
     * This method is similar to the method loadByAttribute(String tagName, String attributeName,String value);
     * however, this return one list of all components which contains the same value of attribute and are into same tag type
     * E.g: 
     * 
     * <div id ="idDiv">
     * 	<button class="classButton">
     *  <button class="classButton">
     * </div> 
     *  
     *  List<Button> buttons = loadByAttribute(SeleniumButton.class,"idDiv","button","class", "classButton")
     *  
     *  
     * @param type: type of the  instance of component  which will instantiate. 
     * @param IdFather: id of the tag which contains the  components sons, whether this attribute is null 
     * will be considered all elements in  HTML which contains the same tagName, attribute and value.  
     * @param tagName: name of the tag of the components sons 
     * @param attributeName: attribute of components sons 
     * @param value : value of attribute 
     * @return List of  components which contains the same value of attribute and are into tag type
     */
    public <T extends Component, Y extends T> List<T> loadByAttribute(Class<Y> type, final String IdFather, final String tagName, 
			final String attributeName, final String value);
    
}
