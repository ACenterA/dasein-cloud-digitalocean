/**
 * Copyright (C) 2012-2015 Dell, Inc.
 * See annotations for authorship information
 *
 * ====================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ====================================================================
 */

package org.dasein.cloud.digitalocean.models.actions.droplet;

import org.dasein.cloud.digitalocean.models.rest.ActionType;
import org.dasein.cloud.digitalocean.models.rest.DigitalOceanPostAction;

public class Stop extends DigitalOceanPostAction {	
		
	public Stop() {
		actionType = ActionType.DROPLET;
	}
	
	@Override	
	public  String getType() {			
		return "power_off";
	}
	
}

