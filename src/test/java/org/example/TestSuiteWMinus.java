package org.example;

import org.junit.platform.suite.api.*;

@Suite
@SelectClasses(CalcTest.class)
@ExcludeTags({"summ", "parametrizedSum"})
public class TestSuiteWMinus {
}




