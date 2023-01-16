/*
 * Copyright (c) 2011-2020 Contributors to the Eclipse Foundation
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0, or the Apache License, Version 2.0
 * which is available at https://www.apache.org/licenses/LICENSE-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0 OR Apache-2.0
 */
package io.vertx.json.schema.common.dsl;

import io.vertx.codegen.annotations.Fluent;

public final class NumberSchemaBuilder extends SchemaBuilder<NumberSchemaBuilder, NumberKeyword> {

  NumberSchemaBuilder() {
    super(SchemaType.NUMBER);
  }

  @Fluent
  public NumberSchemaBuilder asInteger() {
    type(SchemaType.INTEGER);
    return this;
  }

  public boolean isIntegerSchema() {
    // for legacy, while the deprecation is still in place
    return this.type.equals(SchemaType.INT) || this.type.equals(SchemaType.INTEGER);
  }

}
