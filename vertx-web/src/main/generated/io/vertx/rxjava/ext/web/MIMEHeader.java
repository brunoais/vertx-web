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


public class MIMEHeader extends ParsedHeaderValue {

  final io.vertx.ext.web.MIMEHeader delegate;

  public MIMEHeader(io.vertx.ext.web.MIMEHeader delegate) {
    super(delegate);
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  /**
   * Gets the parsed component part of the MIME. This is the string between the beginning and the first '/' of the MIME
   * @return The component of the MIME this represents
   */
  public String component() { 
    String ret = delegate.component();
    return ret;
  }

  /**
   * Gets the parsed subcomponent part of the MIME. This is the string between the first '/' and the ';'
   * or the end of the MIME
   * @return The subcomponent of the MIME this represents
   */
  public String subComponent() { 
    String ret = delegate.subComponent();
    return ret;
  }


  public static MIMEHeader newInstance(io.vertx.ext.web.MIMEHeader arg) {
    return arg != null ? new MIMEHeader(arg) : null;
  }
}
