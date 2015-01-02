package com.magnus;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DiamondTest {

  @Test
  public void create_diamond_with_single_ray_ofA() throws Exception {
    Diamond diamond = new Diamond();
    assertThat(diamond.createRow("A"), is("-A-"));
  }
}
