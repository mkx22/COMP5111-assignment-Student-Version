package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-326) + "'", int3 == (-326));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! ", (-193));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", false, (int) (byte) -1, (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) 1, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  ", false, 97, (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 16, (-4));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ???hi! ???hi! ???hi! ?????hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\n", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\r", "hi! \r\rhi! \r\nhi! \r\n", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (-2), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false, (int) (byte) 1, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", 6, 99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\r", (-11));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true, (-91), (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (int) '\000', 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false, 335, (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        char[] charArray7 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\r\n\n\r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 18, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", false, 72, (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 72, (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, 26, (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 104, 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", 9, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!   hi!  \nhi!  ", 41, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n\r\nhi! \r\rhi! \r\nhi! \r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi! ??hi! ??hi! ?  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ???hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (-13), (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\n  \r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true, 335, (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (-13), (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 14, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  , h,  , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  , i,  , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  , !,  , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  ]");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 100, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", pattern1, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (-18), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", " ", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray13 = new char[] { 'a', '4', '4', ' ', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \n  \n     \n  \n   \n\n  \n   \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        char[] charArray8 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r\r  \r\n  \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", 194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", false, 77, (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 0, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n, \r, \n,  , \r, \r, \n, \r, \n,  , \r, \n, \n, \r, \n,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", " hi! \r\rhi! \r\nhi! \r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "  \r\r  \r\n  \r", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 26, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) '\n', 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\n", " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 194 + "'", int1 == 194);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  ", false, 107, (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 0, 77);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = new char[] { '\r', '#' };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, #]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", true, (int) '4', (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (-111), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", (-10), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r \r\n \r" + "'", str3, " \n\r\n \r\r \r\n \r");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        double[] doubleArray2 = new double[] { (-91), 23 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-91.0, 23.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \r\rhi! \r\nhi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        int[] intArray1 = new int[] { 29 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[29]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", true, (int) '4', (java.lang.CharSequence) "  \r\r  \r\n  \r", (-21), 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", 47, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\rhi! \r\nhi! \r\n", " \r\r\n \r\r\r \r\r\n \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " \n\r\n \r\r \r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r\n \r\r\r \r\r\n \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", 17, (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\r\n \r\r\r \r\r\n \r\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "  \r\r  \r\n  \r", (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        boolean[] booleanArray5 = new boolean[] { false, true, true, true, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        java.lang.Class<?> wildcardClass12 = booleanArray5.getClass();
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 335, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (int) 'a', (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", " \n\r\n \r\r \r\n \r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (-111));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n     \n  \n   \n\n  \n   ", " \n  \n     \n  \n   \n\n  \n   ", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 10, 335);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", false, (int) (short) 100, (java.lang.CharSequence) "hi! ", 26, 41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-72), 194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\r\n\n\r\r\n\r\n\n\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, 335, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 6, 359);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \r\rhi! \r\nhi! \r\n", "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n\r\n \r\r \r\n \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Class<?> wildcardClass2 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r", pattern1, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \n\r\n \r\r \r\n \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 19, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 17 + "'", int1 == 17);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (int) 'a', 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r\n \r\r\r \r\r\n \r\r", pattern1, " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\n \r\r\r \r\r\n \r\r" + "'", str3, " \r\r\n \r\r\r \r\r\n \r\r");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "hi! ", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n", charSequence1, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        char[] charArray8 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", false, (int) '\n', (java.lang.CharSequence) "  ", 0, 93);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (-18));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 26, (-94));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\r\n \r\r\r \r\r\n \r\r", "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", " hi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", " \n  \n     \n  \n   \n\n  \n   ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        char[] charArray11 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (-3), 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\r  \r\n  \r", false, 20, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 29, 24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r\n", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", true, 72, (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 17, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        char[] charArray9 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n, \r, \n,  , \r, \r, \n, \r, \n,  , \r, \n, \n, \r, \n,  , \r]");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", " hi!   hi!  \nhi!  ", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r\n\n\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r", 4, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        char[] charArray10 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (-10), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '\r', 'a', '4', '4', '4' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n  \n     \n  \n   \n\n  \n   \r", "  \r\r  \r\n  \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        char[] charArray6 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", 194);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 41 + "'", int1 == 41);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\n", pattern1, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-129) + "'", int3 == (-129));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \n     \n  \n   \n\n  \n   ", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        java.lang.Class<?> wildcardClass14 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", false, (-193), (java.lang.CharSequence) "\n", (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        char[] charArray12 = new char[] { 'a', '4', '4', ' ', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 93 + "'", int18 == 93);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r", true, (-27), (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (-107), (-5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 159 + "'", int1 == 159);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", 77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        long[] longArray1 = new long[] { (-18) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass4 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-18]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) " \n\r\n \r\r \r\n \r", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 10, (byte) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 10, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-13), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        long[] longArray5 = new long[] { (-19), 100, '\000', '#', (-1) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-19, 100, 0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r\n \r\r\r \r\r\n \r\r", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\n \r\r\r \r\r\n \r\r" + "'", str3, " \r\r\n \r\r\r \r\r\n \r\r");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        char[] charArray9 = new char[] { '\r', 'a', '4', '4', '4' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        java.lang.Class<?> wildcardClass9 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { " ", "hi! \r", "\r" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (-107), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r", 359);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "hi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \r, h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \n, \r, \n, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 0, 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 4, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\n", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!   hi!  \nhi!  ", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!   hi!  \nhi!  " + "'", str3, " hi!   hi!  \nhi!  ");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \r, h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n  \n     \n  \n   \n\n  \n   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  ]");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r\r  \r\n  \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  , \r, \r,  ,  , \r, \n,  ,  , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 29, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", 94, 359);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { " ", "hi! \r", "\r" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r" + "'", str3, "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        java.lang.Class<?> wildcardClass7 = charSequenceArray3.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ???hi! ???hi! ???hi! ??hi! hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        char[] charArray9 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \n, \r, \n, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\rhi! \r\nhi! \r\n", "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-404) + "'", int3 == (-404));
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r\r  \r\n  \r", "  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", 41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 326 + "'", int1 == 326);
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        char[] charArray7 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        char[] charArray13 = new char[] { 'a', '4', '4', ' ', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "  ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \n     \n  \n   \n\n  \n   ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", 0, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        char[] charArray5 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!   hi!  \nhi!  ", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!   hi!  \nhi!  " + "'", str3, " hi!   hi!  \nhi!  ");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \n\r\n \r\r \r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { " ", "hi! \r", "\r" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        java.lang.Class<?> wildcardClass7 = charSequenceArray3.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", true, 93, charSequence3, 37, 193);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", true, 21, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 72, 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (int) (short) 100, (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 0, (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true, (int) '\n', (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", 0, (-13));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "hi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", false, (-326), (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 20, (-27));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 2, 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 384 + "'", int1 == 384);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 384 + "'", int3 == 384);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        short[] shortArray6 = new short[] { (short) 100, (short) 1, (short) 100, (byte) 1, (byte) 0, (short) 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, 1, 100, 1, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "", 194);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 14 + "'", int3 == 14);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", false, 18, (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", 194, 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", 100, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\rhi! \r\nhi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\n  \r", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", (-129), (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        char[] charArray10 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", 77, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        char[] charArray8 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (-404), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        char[] charArray8 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        float[] floatArray0 = new float[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray0);
        org.junit.Assert.assertNotNull(floatArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        short[] shortArray4 = new short[] { (short) -1, (short) 0, (short) 0, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass11 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 44 + "'", int2 == 44);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", " \r\r\n \r\r\r \r\r\n \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        int[] intArray6 = new int[] { 4, '\000', (-72), 326, (-21), (short) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[4, 0, -72, 326, -21, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r \r\n \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r" + "'", str3, " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", false, 0, (java.lang.CharSequence) "hi!", (-1), 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }
}

