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
public class LanguageHeader extends ParsedHeaderValue {
  private final def io.vertx.ext.web.LanguageHeader delegate;
  public LanguageHeader(Object delegate) {
    super((io.vertx.ext.web.LanguageHeader) delegate);
    this.delegate = (io.vertx.ext.web.LanguageHeader) delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * The tag of the language as specified by 
   * <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>.<br>
   * Equivalent to 
   * @return 
   */
  public String tag() {
    def ret = delegate.tag();
    return ret;
  }
  /**
   * The subtag of the language as specified by 
   * <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>.<br>
   * Equivalent to 
   * @return 
   */
  public String subtag() {
    def ret = delegate.subtag();
    return ret;
  }
  /**
   * A subtag of this language header.<br>
   * + info: <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>
   * @param level 
   * @return 
   */
  public String subtag(int level) {
    def ret = delegate.subtag(level);
    return ret;
  }
  /**
   * The number of subtags this value has.
   * @return 
   */
  public int subtagCount() {
    def ret = delegate.subtagCount();
    return ret;
  }
}
