package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", pattern1, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 128 + "'", int3 == 128);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \n  \n     \n  \n   \n\n  \n   \r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", pattern1, "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\rhi! \r\nhi! \r\n", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 18 + "'", int3 == 18);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        char[] charArray10 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        char[] charArray10 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\r  \r\n  \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", false, (-10), (java.lang.CharSequence) "  ", (-19), 11);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n", 43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r\n \r\r\r \r\r\n \r\r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\n \r\r\r \r\r\n \r\r" + "'", str3, " \r\r\n \r\r\r \r\r\n \r\r");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 93, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        float[] floatArray2 = new float[] { 100L, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        java.lang.Class<?> wildcardClass7 = floatArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        char[] charArray8 = new char[] { '\r', 'a', '4', '4', '4' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", pattern1, "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r", pattern1, " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r\n \r\r\r \r\r\n \r\r", "\n", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r" + "'", str3, " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 77 + "'", int10 == 77);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 18, (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "  ", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        int[] intArray1 = new int[] { 3 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[3]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \n     \n  \n   \n\n  \n   ", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\r", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) "\n", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        java.lang.Class<?> wildcardClass4 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", " \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "hi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 128);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 107 + "'", int3 == 107);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\n  \r", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "", 107);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-5), (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 193 + "'", int1 == 193);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", charSequence1, 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false, 359, (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", 94, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\rhi! \r\nhi! \r", " hi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 0, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 2, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47 + "'", int1 == 47);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (int) (byte) -1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 104 + "'", int1 == 104);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\nhi! \r\rhi! \r\nhi! \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r\r  \r\n  \r", (java.lang.CharSequence) "hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r\n \r\r\r \r\r\n \r\r", " \r\r\n \r\r\r \r\r\n \r\r", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 8, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??????????????h???????????i???????????!??????????? ??????????????????????? ??????????? ??????????????????????? ??????????? ??????????? ??????????? ??????????? ??????????????????????? ??????????? ??????????????????????? ??????????? ??????????? ??????????????????????????????????? ??????????? ??????????????????????? ??????????? ??????????? ?????????????????????????hi! ??hi! ?h???hi! ??hi! ??hi! ?i???hi! ??hi! ??hi! ?!???hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n  \n     \n  \n   \n\n  \n   \r", " \n  \n     \n  \n   \n\n  \n   ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '\r', 'a', '4', '4', '4' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\n", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", true, 99, (java.lang.CharSequence) "hi! ", 18, (-19));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 72, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "  \r\r  \r\n  \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r", charSequence1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n  \n     \n  \n   \n\n  \n   \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r\r  \r\n  \r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r, \r,  ,  , \r, \n,  ,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        char[] charArray9 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 47, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", false, 0, (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 8, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "hi! \r", " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n  \n     \n  \n   \n\n  \n   \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 3, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray4);
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
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \n  \n     \n  \n   \n\n  \n   \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "hi! \r\rhi! \r\nhi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 0, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", pattern1, "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, h, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, i, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, !, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r]");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", 14, 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        short[] shortArray2 = new short[] { (short) 1, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass7 = shortArray2.getClass();
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 193);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-21) + "'", int3 == (-21));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (-193));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false, (int) '4', (java.lang.CharSequence) " ", 18, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", " hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! ", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????????hi! ??hi! ??hi! ??????hi! ??hi! ??hi! ????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ??????hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", false, 0, (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 41, 129);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 330 + "'", int1 == 330);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 23, 193);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, 9, (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-19), 99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charSequence1, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true, 193, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 4, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27) + "'", int3 == (-27));
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        byte[] byteArray2 = new byte[] { (byte) 100, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", " \n  \n     \n  \n   \n\n  \n   ", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r" + "'", str3, " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi! ??hi! ??hi! ?h???hi! ??hi! ??hi! ?i???hi! ??hi! ??hi! ?!???hi! ??hi! ??hi! ?hi! ???hi! ???hi! ???hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 107 + "'", int1 == 107);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 29, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 194 + "'", int3 == 194);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", " \r\r\n \r\r\r \r\r\n \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        char[] charArray10 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 12, (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "hi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] { '\000' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??hi! ???hi! ???hi! ???hi! ?????hi! ??hi! ??hi! ? ??? ??hi! ???hi! ???hi! ???hi! ?????hi! ??hi! ??hi! ? ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { " ", "hi! \r", "\r" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r]");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 37 + "'", int3 == 37);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", false, 18, (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (int) '#', (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        java.lang.Class<?> wildcardClass13 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 100, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "  \r\r  \r\n  \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 335 + "'", int1 == 335);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-91), 210);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 100, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-13));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        short[] shortArray2 = new short[] { (short) 1, (short) 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (-193));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-22), (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (java.lang.CharSequence) "\r", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray7);
        java.lang.Class<?> wildcardClass13 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\r", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", 1, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        long[] longArray4 = new long[] { 1L, (-1L), ' ', (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        java.lang.Class<?> wildcardClass8 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 99, (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n  \n     \n  \n   \n\n  \n   \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 43);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", 9, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        char[] charArray7 = new char[] { 'a', '4', '4', ' ', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\r\n\n\r\r\n\r\n\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-11) + "'", int3 == (-11));
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        char[] charArray8 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi! \n  \n     \n  \n   \n\n  \n   \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 22, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int[] intArray5 = new int[] { 100, 1, '#', 100, '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 35, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", true, (int) 'a', (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 0, 43);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) " ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  , \r, \r, \r,  , \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", (-5), (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "hi! \n  \n     \n  \n   \n\n  \n   \r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        float[] floatArray5 = new float[] { 29, (-94), 20, 100, 128 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[29.0, -94.0, 20.0, 100.0, 128.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        double[] doubleArray6 = new double[] { '#', 1.0d, 0L, 100.0d, 100.0d, 10.0f };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 1.0, 0.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", 94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " \r\r\n \r\r\r \r\r\n \r\r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", 4, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  ", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 77, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ??????? ??????????? ??????????? ???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false, 43, (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", 93, 107);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charSequence1, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        char[] charArray13 = new char[] { 'a', '4', '4', ' ', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        char[] charArray7 = new char[] { '\r', 'a', '4', '4', '4' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 26 + "'", int10 == 26);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 93 + "'", int16 == 93);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 9, 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r", "\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 72);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r\r  \r\n  \r", pattern1, "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int[] intArray1 = new int[] { 3 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[3]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" hi! \r\rhi! \r\nhi! \r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-111) + "'", int3 == (-111));
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n  \n     \n  \n   \n\n  \n   \r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", false, 16, (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 114, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        char[] charArray12 = new char[] { 'a', '4', '4', ' ', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", true, (-13), (java.lang.CharSequence) "hi! \r", (-21), 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi! \r\rhi! \r\nhi! \r", "\r", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!   hi!  \nhi!  " + "'", str3, " hi!   hi!  \nhi!  ");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true, (int) (byte) 1, charSequence3, 2, (int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", pattern1, "hi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (-18), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        char[] charArray7 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\n  \r", pattern1, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charSequence1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", 4, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (-4), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) 10, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-107) + "'", int3 == (-107));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", " hi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        float[] floatArray2 = new float[] { (byte) 100, 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\r\n\n\r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        char[] charArray8 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        char[] charArray11 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        short[] shortArray2 = new short[] { (short) 1, (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r]");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\r\n", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", 194, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", false, (-5), (java.lang.CharSequence) " hi!   hi!  \nhi!  ", 93, 128);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 9, (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 9, (-13));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        char[] charArray7 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi!   hi!  \nhi!  ", 10, 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\n  \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, 104, (java.lang.CharSequence) "  \r\r  \r\n  \r", 37, (-18));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (-27), 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", " \n\r\nhi! \r\rhi! \r\nhi! \r", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \r, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \r, \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r]");
    }
}

