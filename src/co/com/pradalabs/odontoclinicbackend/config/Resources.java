/*
 * Copyright 2013 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package co.com.pradalabs.odontoclinicbackend.config;

/**
 * Created with PradaLabs
 * User: Andres Prada <andres209@google.com>
 * Date: 12/2/2014
 * Time: 8:17pm
 */


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import co.com.pradalabs.odontoclinicbackend.rest.GsonMessageBodyHandler;




@ApplicationPath("/rest")
public class Resources extends Application {
 
  public Set<Class<?>> getClasses() {
    Set<Class<?>> s = new HashSet<Class<?>>();
    s.add(OdontoClinicResource.class);
    s.add(GsonMessageBodyHandler.class);
    return s;
  }
}
