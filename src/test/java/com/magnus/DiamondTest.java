package com.magnus;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DiamondTest {

  @Test
  public void create_diamond_with_single_ray_ofA() throws Exception {
    Diamond diamond = new Diamond();
    String[] result = diamond.create(new String[] {"A"});
    assertThat(result[0], is("-A-"));
  }

  @Test
  public void create_diamond_with_row_of_A_andB() throws Exception {
    Diamond diamond = new Diamond();
    String[] result = diamond.create(new String[] {"A", "B"});
    assertThat(result[1], is("B-B"));
  }
}
