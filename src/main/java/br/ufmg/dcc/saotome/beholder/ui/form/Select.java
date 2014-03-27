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
package br.ufmg.dcc.saotome.beholder.ui.form;

import java.util.List;

import br.ufmg.dcc.saotome.beholder.ui.Component;
import br.ufmg.dcc.saotome.beholder.ui.event.Clickable;

/** The interface represents a HTML Components <b>Select</b>.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 */
public interface Select extends Component, Clickable {

    /**
     * Get the available options of the select.
     * @return List of options in text
     */
    List<Option> getOptions();

    /**
     * Select an option by the text.
     * @param optionText text of the option to be selected
     */
    void select(String optionText);

    /**
     * Select an option by the index order.
     * @param optionIndex index of the option to be selected
     */
    void select(int optionIndex);
    
    /** The <b>Option</b> is a data class that represents the HTML element Option from a Select Tag.
     * This object can only exist if it has a Select associated to it. So, the class
     * is a inner class of the Select interface.
     * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
     * @see Select
     */
    class Option{
    	/** The index of the element in the Select in the page.*/
    	private Integer index;
    	/** The value to be submited to the server */
		private String value;
		/** The text displayed to user in the option component */
		private String text;
		
		/** TODO
		 * @return the index
		 */
		public Integer getIndex() {
			return index;
		}

		/** TODO
		 * @return the value
		 */
		public String getValue() {
			return value;
		}

		/** TODO
		 * @return the text
		 */
		public String getText() {
			return text;
		}

		/** TODO
		 * @param index the index to set
		 */
		public void setIndex(Integer index) {
			this.index = index;
		}

		/** TODO
		 * @param value the value to set
		 */
		public void setValue(String value) {
			this.value = value;
		}

		/** TODO
		 * @param text the text to set
		 */
		public void setText(String text) {
			this.text = text;
		}
    }
}
