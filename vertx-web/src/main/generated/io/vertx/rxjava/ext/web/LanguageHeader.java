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

package io.vertx.rxjava.ext.web;

import java.util.Map;
import rx.Observable;
import java.util.Map;
import java.util.Set;


public class LanguageHeader extends ParsedHeaderValue {

  final io.vertx.ext.web.LanguageHeader delegate;

  public LanguageHeader(io.vertx.ext.web.LanguageHeader delegate) {
    super(delegate);
    this.delegate = delegate;
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
    String ret = delegate.tag();
    return ret;
  }

  /**
   * The subtag of the language as specified by 
   * <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>.<br>
   * Equivalent to 
   * @return 
   */
  public String subtag() { 
    String ret = delegate.subtag();
    return ret;
  }

  /**
   * A subtag of this language header.<br>
   * + info: <a href="https://tools.ietf.org/html/rfc7231#section-3.1.3.1">rfc7231#section-3.1.3.1</a>
   * @param level 
   * @return 
   */
  public String subtag(int level) { 
    String ret = delegate.subtag(level);
    return ret;
  }

  /**
   * The number of subtags this value has.
   * @return 
   */
  public int subtagCount() { 
    int ret = delegate.subtagCount();
    return ret;
  }


  public static LanguageHeader newInstance(io.vertx.ext.web.LanguageHeader arg) {
    return arg != null ? new LanguageHeader(arg) : null;
  }
}
