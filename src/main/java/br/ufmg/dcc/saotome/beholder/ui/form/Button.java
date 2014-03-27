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

import br.ufmg.dcc.saotome.beholder.ui.Component;
import br.ufmg.dcc.saotome.beholder.ui.event.Clickable;

/** The interface represents a HTML Components <b>Button</b>.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 */
public interface Button extends Clickable, Component {

    /** Enumeration of button types.
     */
    enum ButtonType {
       /** Buttons of type SUBMIT send the form elements values by POST or
        * GET.*/
        SUBMIT,
        /** Buttons of type RESET clean the form elements values to default
         * values.*/
        RESET,
        /** Buttons of type BUTTON use actions represented in the event onClick
         * by javascript.*/
        BUTTON,
        /** Buttons of type IMAGE use actions represented in the event onClick
         * by javascript and the button is represented by a image.*/
        IMAGE;
    }

    /** Set the type of behavior that the button execute when it's clicked.
     * @param type of button
     */
    void setType(ButtonType type);

    /** Get the type of behavior that the button execute when it's clicked.
     * @return type of button
     */
    ButtonType getType();
}
