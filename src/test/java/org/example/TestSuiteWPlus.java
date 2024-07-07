package org.example;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasses(CalcTest.class)
@ExcludeTags({"minus","parametrizedMinus"})
public class TestSuiteWPlus {
}




