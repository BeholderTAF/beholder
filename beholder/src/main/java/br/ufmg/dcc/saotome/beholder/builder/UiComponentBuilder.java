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
package br.ufmg.dcc.saotome.beholder.builder;

import br.ufmg.dcc.saotome.beholder.ui.Div;
import br.ufmg.dcc.saotome.beholder.ui.GenericComponent;
import br.ufmg.dcc.saotome.beholder.ui.Link;
import br.ufmg.dcc.saotome.beholder.ui.IFrame;
import br.ufmg.dcc.saotome.beholder.ui.form.Button;
import br.ufmg.dcc.saotome.beholder.ui.form.Checkbox;
import br.ufmg.dcc.saotome.beholder.ui.form.RadioButton;
import br.ufmg.dcc.saotome.beholder.ui.form.Select;
import br.ufmg.dcc.saotome.beholder.ui.form.TextArea;
import br.ufmg.dcc.saotome.beholder.ui.form.TextField;
import br.ufmg.dcc.saotome.beholder.ui.table.Table;

/**
 * The Interface UiComponentBuilder returns all Interface components.
 * The test cases uses it to create new instances of component classes,
 * separating the technology used to run the tests of the creation of
 * test cases.
 * @author Ícaro Clever F. Braga (icaroclever@gmail.com)
 */
public interface UiComponentBuilder {
	
	/**
     * Returns an object instance that implements a GenericComponent interface.
     * @return An object that implements the GenericComponent interface
     * @see Button
     */
    GenericComponent genericComponentInstance();
    
    /**
     * Returns an object instance that implements a Button interface.
     * @return An object that implements the Button interface
     * @see Button
     */
    Button buttonInstance();

    /**
     * Returns an object instance that implements a TextField interface.
     * @return An object that implements the TextField interface
     * @see TextField
     */
    TextField textFieldInstance();
    
    /**
     * Returns an object instance that implements a TextArea interface.
     * @return An object that implements the TextArea interface
     * @see TextArea
     */
    TextArea textAreaInstance();    

    /**
     * Returns an object instance that implements a Checkbox interface.
     * @return An object that implements the Checkbox interface
     * @see Checkbox
     */
    Checkbox checkboxInstance();

    /**
     * Returns an object instance that implements a RadioButton interface.
     * @return An object that implements the RadioButton interface
     * @see RadioButton
     */
    RadioButton radioButtonInstance();

    /**
     * Returns an object instance that implements a Select interface.
     * @return An object that implements the Select interface
     * @see Select
     */
    Select selectFieldInstance();
    
    /**
     * Returns an object instance that implements a Link interface.
     * @return An object that implements the Link interface
     * @see Link
     */
    Link linkInstance();
    
    /**
     * Returns an object instance that implements a Modal interface.
     * @return An object that implements the Modal interface
     * @see IFrame
     */
    IFrame iFrameInstance();
    
    /**
     * Returns an object instance that implements a Table interface.
     * @return An object that implements the Table interface
     * @see Table
     */
    Table tableInstance();
    
    /**
     * Returns an object instance that implements a Div interface.
     * @return An Div implemented object
     * @see Div
     */
    Div divInterface();
}
