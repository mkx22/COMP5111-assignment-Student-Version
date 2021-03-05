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
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 16, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", 10, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        char[] charArray3 = new char[] { '#' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r \r ", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" ", "    \r       \r     \r \r  \r \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n " + "'", str3, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", " \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", 15, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  , \n,  , \n,  , \n, \r, \n,  , \n,  , \n,  , \n, \n, \n,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r \r \r   \n \r\n ", true, 7, (java.lang.CharSequence) " \r ", (-36), (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "   \r   \n ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r \r   \n \r\n ", pattern1, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", 37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \r \r        \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n ", "  \n  \r \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \r \r        \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r h \r i \r ! \r   \r ", "\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h  i  !     " + "'", str3, "  h  i  !     ");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n ", "   \r   \n ", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "  \r \r        \n ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \r \r \r \r \r \r \r ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "   \r   ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   \n \r\n ", "  \r \r ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h  i  !     ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r     \r \r  \r \n ", "       \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", 94, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 444, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:      ?   ? ??            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   ", " \r \r \r \r \r \r \r ", "\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (-90), (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r    \n  \r \n ", charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \r   ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r \r \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \r   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \r   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \r,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 444 + "'", int1 == 444);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r \r \r ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", pattern1, "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n ", "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "  \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 713 + "'", int1 == 713);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "  \r \r \r   \n \r\n ", "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        long[] longArray0 = new long[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray0);
        org.junit.Assert.assertNotNull(longArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", pattern1, "  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 102 + "'", int3 == 102);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", 13, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r     \r \r  \r \n ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (-1), (-444));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", true, 81, (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 1, (java.lang.CharSequence) "", 31, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", "  h  i  !     ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 22, (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) '#', (-621));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "  \n\n\r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r        \n ", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r        \n " + "'", str3, "  \r \r        \n ");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "   \r   ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", pattern1, "  h  i  !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! " + "'", str3, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "  \r \r \r   \n \r\n ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ,  ,  ,  ,  ,  , \n,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r\n ", "\n \r \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true, (int) (short) 10, (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 100, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n\r\n \n \n \n\n\n \n", "   \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", true, (int) '\n', charSequence3, 27, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        int[] intArray3 = new int[] { 629, (short) 100, 4 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[629, 100, 4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n " + "'", str3, "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", pattern1, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "  \n  \r \r   \n \r\n ", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 14, 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        short[] shortArray1 = new short[] { (short) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        java.lang.Class<?> wildcardClass14 = shortArray1.getClass();
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", 29, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 629, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n  \r \r   \n \r\n     \n  \r \n ", "\n", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "       \n ", true, (-5), (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (int) '\n', 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r \r \r ", (java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r h \r i \r ! \r   \r ", "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (-3), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (-26), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 476 + "'", int1 == 476);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String[] strArray4 = new java.lang.String[] { " \r \r \r ", "  \n  \r \r   \n \r\n ", "    \r    \n  \r \n ", "         \r    \r \r   \n \r\n     \n  \r \n " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " " + "'", str6, " ");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 9, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 85, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (java.lang.CharSequence) "", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n  \r \r   \n \r\n ", "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r     \r \r  \r \n ", pattern1, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r     \r \r  \r \n ", " \r ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n " + "'", str3, "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "   \r   \n ", " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! " + "'", str3, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "   \r   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "    \r    \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   ", pattern1, "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) '\r', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (-16), (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r \r ", " \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r \r ", "hi! ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        float[] floatArray6 = new float[] { (-12), (byte) 10, (-22), 4, (-22), 14 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray6);
        org.junit.Assert.assertNotNull(floatArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray6), "[-12.0, 10.0, -22.0, 4.0, -22.0, 14.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r \r \r   \n \r\n ", "   \r   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 80 + "'", int14 == 80);
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass11 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", "         \r    \r \r   \n \r\n     \n  \r \n ", "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", true, 36, (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", 14, 713);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r \r        \n ", "\n \r \r \r ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r        \n " + "'", str3, "  \r \r        \n ");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r    \n  \r \n ", pattern1, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n ", (java.lang.CharSequence) "  \r ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", " \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-6) + "'", int3 == (-6));
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        char[] charArray6 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", pattern1, "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", pattern1, "  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", (int) (byte) 100, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  h  i  !     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r \r \r ", pattern1, "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "  \r \r        \n ", (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (-22), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", true, 107, (java.lang.CharSequence) "hi!", 0, (-7));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h  i  !     ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h  i  !     " + "'", str3, "  h  i  !     ");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", " \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:        ?        ?        ? ??       ?        ?        ? ??       ?        ?       ?       ?          ? ?       ?  ?        ?           ? ?       ?    ?          ? ?       ? ?   ?          ? ?       ? ?   ?          ? ?       ? ?   ?          ? ?       ?    ?          ? ?       ?    ?          ? ?       ?        ?   ?          ? ?       ? ?       ?   ?          ? ?       ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 7, (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", false, 34, (java.lang.CharSequence) "\n", 85, 629);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:          ? ??            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        int[] intArray2 = new int[] { 1, (-3) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -3]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "    \r    \n  \r \n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 0, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        boolean[] booleanArray3 = new boolean[] { false, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        java.lang.Class<?> wildcardClass8 = booleanArray3.getClass();
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", "  \n\n\r   \n \r\n ", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true, 33, (java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (-72), 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        char[] charArray5 = new char[] { '4', '#', ' ', '\000' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r        \n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4# \000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4# \000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, #,  , \000]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h  i  !     ", charSequence1, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("         \r    \r \r   \n \r\n     \n  \r \n ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (int) ' ', (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 5, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \r \r \r ", (java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", false, 94, (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 15, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n  \r \r   \n \r\n     \n  \r \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        char[] charArray7 = new char[] { '\r', '\n', '\n', 'a', '\n' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \n, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", true, 677, (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 16, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "   \r   \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r \r \r ", 31, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) " \r ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass16 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n" + "'", str14, "\n");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h  i  !     ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r \r \r   \n \r\n ", 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "hi! ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   \n \r\n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? ? ??? ? ? ??? ?       ?       ?   ? ??  ? ?    ? ??    ?   ? ?? ?   ?   ? ?? ?   ?   ? ?? ?   ?   ? ??    ?   ? ??    ?   ? ?? ?   ?   ? ?? ??   ?   ? ??  ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ??? ? ? ??? ? ? ??? ? ? ? ? ??? ? ? ??? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-629) + "'", int3 == (-629));
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", true, 8, (java.lang.CharSequence) " \r h \r i \r ! \r   \r ", 37, 37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \r\n ", " \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        char[] charArray4 = new char[] { 'a', '\r', '4' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a\r4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a\r4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a, \r, 4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "  \n\n\r   \n \r\n ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", false, (-90), (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", 629, (-16));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", "  \r \r        \n ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! " + "'", str3, "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 158, 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r ", (int) (short) 0, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        double[] doubleArray6 = new double[] { 713, 10L, (-7), 0, 444, (-12) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[713.0, 10.0, -7.0, 0.0, 444.0, -12.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h  i  !     ", 158, (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\r", "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "  \r \r ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n " + "'", str3, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", false, 10, (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", 34, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        boolean[] booleanArray5 = new boolean[] { false, false, true, true, false };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, false, true, true, false]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", " \r h \r i \r ! \r   \r ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \r \r \r ", (-5), (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r h \r i \r ! \r   \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \r \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "  \r \r        \n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "  h  i  !     ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 22, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r    \n  \r \n ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 0, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { " " };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!?hi!hhi!ihi!!hi! hi!?hi!hhi!ihi!!hi! hi! hi! hi! hi!?hi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!?hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!?hi! hi! hi! hi!hhi!ihi!!hi! hi!?hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        char[] charArray5 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \n, h, i, !,  ,  ,  ,  , \r,  ,  ,  , h, i, !,  ,  , h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \n, h, i, !,  ,  , h, i, !,  ,  ,  ,  , \r,  ,  ,  , h, i, !,  , \n, h, i, !,  ,  , h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "hi!", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", pattern1, "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n " + "'", str3, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r \r \r   \n \r\n ", "  \r \r \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", pattern1, "  h  i  !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 107, 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "  \r ", 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "   \r   \n ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r \r \r ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r \r \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", false, 31, (java.lang.CharSequence) "  \r \r \r   \n \r\n ", (-9), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        float[] floatArray1 = new float[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", true, 16, (java.lang.CharSequence) "hi! ", 14, (-629));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ?  ?  ?  ?  ?  ?  ?  ? ? ?  ?  ?  ? ? ? ? ?  ?  ? ? ? ?? ?  ?  ?  ?  ? ? ?  ? ? ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        char[] charArray8 = new char[] { '\r', '\n', '\n', 'a', '\n' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \n, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "         \r    \r \r   \n \r\n     \n  \r \n ", "\n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", 34, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        boolean[] booleanArray3 = new boolean[] { false, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n ", pattern1, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) (short) 0, (-19));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ,  ,  , \r,  ,  ,  ,  ,  , \r,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ,  ]");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n \r\n ", "  \n  \r \r   \n \r\n ", "hi!", "   \r   \n \r\n ", "   \r   \n \r\n ", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "  \n  \r \r   \n \r\n ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charSequence1, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \n ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h  i  !     ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (int) '4', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        boolean[] booleanArray4 = new boolean[] { false, false, false, false };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", " \r \r \r ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        float[] floatArray5 = new float[] { (-22), (-19), 94, 0.0f, 9 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-22.0, -19.0, 94.0, 0.0, 9.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r ", 81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "\n \r \r \r ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  h  i  !     ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h  i  !     " + "'", str3, "  h  i  !     ");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \r\n ", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        char[] charArray7 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r        \n ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  \r \r        \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        float[] floatArray5 = new float[] { (-22), (-19), 94, 0.0f, 9 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-22.0, -19.0, 94.0, 0.0, 9.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    \r       \r   \n \r\n  \r \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n ", pattern1, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (int) '#', (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 14, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", pattern1, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (java.lang.CharSequence) "\n", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \n  \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        long[] longArray6 = new long[] { ' ', (byte) 100, 100L, 0L, '\r', (short) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, 100, 100, 0, 13, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", pattern1, "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "  h  i  !     ", "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (-5), 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n ", (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 257 + "'", int1 == 257);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "    \r       \r   \n \r\n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", (-90));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        char[] charArray11 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r        \n ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) " ", (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r \r   \n \r\n ", pattern1, " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 38 + "'", int1 == 38);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 478 + "'", int1 == 478);
    }
}

