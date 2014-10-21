/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.immutables;

import com.google.common.collect.ImmutableList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * Unit test for generated {@link ImmutableType} class.
 */
public class TypeTest {
  @Test
  public void testBuilder() {
    Type t = ImmutableType.builder()
        .name("Jenny")
        .addPhoneNumbers(8675309L)
        .build();

    assertEquals("Jenny", t.name());
    assertEquals(ImmutableList.of(8675309L), t.phoneNumbers());
    assertFalse(t.description().isPresent());
  }
}
