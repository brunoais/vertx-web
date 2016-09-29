/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.ext.web;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import io.vertx.core.json.JsonObject
import java.util.Map
import java.util.Set
@CompileStatic
public class MIMEHeader extends ParsedHeaderValue {
  private final def io.vertx.ext.web.MIMEHeader delegate;
  public MIMEHeader(Object delegate) {
    super((io.vertx.ext.web.MIMEHeader) delegate);
    this.delegate = (io.vertx.ext.web.MIMEHeader) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Gets the parsed component part of the MIME. This is the string between the beginning and the first '/' of the MIME
   * @return The component of the MIME this represents
   */
  public String component() {
    def ret = delegate.component();
    return ret;
  }
  /**
   * Gets the parsed subcomponent part of the MIME. This is the string between the first '/' and the ';'
   * or the end of the MIME
   * @return The subcomponent of the MIME this represents
   */
  public String subComponent() {
    def ret = delegate.subComponent();
    return ret;
  }
}
