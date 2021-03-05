package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 4, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!   hi!  \nhi!  ", 47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", pattern1, "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " hi!   hi!  \nhi!  ", true, 11, (java.lang.CharSequence) " \n\r\n \r\r \r\n \r", 129, 41);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", 22, (-193));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        char[] charArray6 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ???hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ???hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", false, 64, (java.lang.CharSequence) "\n", 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        char[] charArray6 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ?     ?  ?   ??  ?   h ?  ?     ?  ?   ??  ?   i ?  ?     ?  ?   ??  ?   ! ?  ?     ?  ?   ??  ?     ?  ?     ?  ?   ??  ?   ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 64);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        char[] charArray0 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        java.lang.Class<?> wildcardClass1 = charArray0.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n", 384);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "hi! ", 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", (int) (short) -1, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi! \r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        char[] charArray6 = new char[] { '\000' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\000]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        char[] charArray9 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \n     \n  \n   \n\n  \n   ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", 3, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 21, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", " \n\r\n \r\r \r\n \r", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  , \r, \r, \r,  , \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true, 5, (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (-114), 445);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", charArray5);
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
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi! \r\rhi! \r\nhi! \r", " hi!   hi!  \nhi!  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \r\rhi! \r\nhi! \r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (-404), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        char[] charArray8 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray8);
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
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false, 0, (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (-107), 70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \n, \r, \n, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n, \n, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 111 + "'", int2 == 111);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        byte[] byteArray3 = new byte[] { (byte) -1, (byte) 1, (byte) 0 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[-1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        char[] charArray9 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", false, 100, (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (-94), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi! ", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        char[] charArray5 = new char[] { '4', 'a', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        java.lang.Class<?> wildcardClass8 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" hi!   hi!  \nhi!  ", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!   hi!  \nhi!  " + "'", str3, " hi!   hi!  \nhi!  ");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-472) + "'", int3 == (-472));
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (-129), 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n  \n     \n  \n   \n\n  \n   \r", "hi!", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" hi!   hi!  \nhi!  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  hi!   hi!  ?hi!  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r, \n, h, i, !,  , \r, \r, h, i, !,  , h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r" + "'", str3, " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (-11), (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", false, (-10), (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (-72), (-107));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r" + "'", str3, " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (-1), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-4), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r, \r, \n,  , \r, \r, \r,  , \r, \r, \n,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 21);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\n  \r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-18));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int[] intArray1 = new int[] { (short) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", 111);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 522 + "'", int3 == 522);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r\n \r\r\r \r\r\n \r\r", " hi!   hi!  \nhi!  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 77, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n,  , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  , \r]");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-107), 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  hi! hi! ?????????????????? ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ?????????????????? ???????????????? ???????????????? ??????????????????? ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ???hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " ", 77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true, (-3), (java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", (-193), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ???hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charSequence1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, 111, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-94), 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r\r  \r\n  \r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        short[] shortArray4 = new short[] { (short) -1, (short) 0, (short) 0, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
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
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        long[] longArray4 = new long[] { 1L, (-1L), ' ', (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[1, -1, 32, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", " \n\r\n \r\r \r\n \r", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence3, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
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
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", true, (int) '\r', (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 15, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", false, 93, (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (-404), (-193));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-114));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!hi!  hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ?hi! ?hi! ?hi! ?hi!  hi! ?hi! ??   ? ? ?   ? ? ? ? ?   ? ? ? ? ?   ? hi! ???hi! ??   ? ? ?   ? ? ? ? ?   ? ? ? ? ?   ? hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        char[] charArray13 = new char[] { 'a', '4', '4', ' ', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray13);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \r, h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 194 + "'", int2 == 194);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", 522);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-18), (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '\r', 'a', '4', '4', '4' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 23, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 359, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        int[] intArray1 = new int[] { 330 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[330]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r", charArray4);
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", 47, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n \r\r \r\n \r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        char[] charArray9 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\n \r\r \r\n \r", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n\r\n", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray8);
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
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!   hi!  \nhi!  ", "hi! \r\rhi! \r\nhi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-72));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 21, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] { 'a' };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[a]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        long[] longArray4 = new long[] { 10L, (short) -1, 10, 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
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
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r" + "'", str3, " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        char[] charArray10 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray10);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \r, h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (-472));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! ", "hi! \r\rhi! \r\nhi! \r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 44, (-5));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        long[] longArray4 = new long[] { '\n', (-19), 1, (-22) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10, -19, 1, -22]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
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
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\r\n \r\r\r \r\r\n \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", false, 128, (java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 70, 128);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (-114), 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        char[] charArray8 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\r  \r\n  \r", 24, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 193);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        char[] charArray9 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \n  \n     \n  \n   \n\n  \n   \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \n,  ,  , \n,  ,  ,  ,  ,  , \n,  ,  , \n,  ,  ,  , \n, \n,  ,  , \n,  ,  ,  , \r]");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", true, (int) '\000', (java.lang.CharSequence) "\n", 11, (-326));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", false, 47, (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (int) '#', (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 11, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "  \r\r  \r\n  \r", "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        float[] floatArray2 = new float[] { 100L, (short) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[100.0, 10.0]");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int[] intArray4 = new int[] { (byte) 1, (-10), 94, 114 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, -10, 94, 114]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (-472), 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 17, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\n\r\nhi! \r\rhi! \r\nhi! \r", " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????????? hi!   hi!  ?hi!  ????hi! ??hi! ??hi! ????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ??????hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray3);
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
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass10 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-192) + "'", int3 == (-192));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi! \n  \n     \n  \n   \n\n  \n   \r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", (java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (-111));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", false, 384, (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (-193), 64);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        java.lang.Class<?> wildcardClass10 = booleanArray4.getClass();
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int[] intArray5 = new int[] { 100, 1, '#', 100, '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 35, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\r  \r\n  \r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\n\r\r\n\r\n\n\r", "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", false, 15, (java.lang.CharSequence) "  \r\r  \r\n  \r", (-91), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
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
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 359 + "'", int1 == 359);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        char[] charArray8 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r", " \r\r\n \r\r\r \r\r\n \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        char[] charArray7 = new char[] { '\r', 'a', '4', '4', '4' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\r", pattern1, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (-94), 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", " \n\r\n \r\r \r\n \r", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 522);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n", 17, (-111));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r\n", pattern1, "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", 330);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (short) 0, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", true, 17, (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", 522, 522);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '\000', (-404));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false, 14, charSequence3, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", true, (-1), (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", 72, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        boolean[] booleanArray4 = new boolean[] { true, true, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 0, (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-21), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \r, h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r", "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        boolean[] booleanArray3 = new boolean[] { false, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, false]");
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
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        char[] charArray9 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, h, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, i, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, !, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  , \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", pattern1, "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\n  \r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass9 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n, \r, \n,  , \r, \r, \n, \r, \n,  , \r, \n, \n, \r, \n,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        long[] longArray4 = new long[] { 10L, (short) -1, 10, 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (int) (short) -1, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 384);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        char[] charArray12 = new char[] { 'a', '4', '4', ' ', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", 104);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  ", false, 8, (java.lang.CharSequence) "\r", (-21), 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!  hi!   hi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi!hi!  hi!   hi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        boolean[] booleanArray3 = new boolean[] { false, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        char[] charArray5 = new char[] { '4', 'a', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\n \r\r \r\n \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (int) (short) -1, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!   hi!  \nhi!  ", 3, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        float[] floatArray4 = new float[] { (-1), 10, '\000', (-10) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-1.0, 10.0, 0.0, -10.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\rhi! \r\nhi! \r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        short[] shortArray2 = new short[] { (byte) -1, (byte) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[-1, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (-22), 326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n \r\r \r\n \r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r \r\n \r" + "'", str3, " \n\r\n \r\r \r\n \r");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { " ", "hi! \r", "\r" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        short[] shortArray2 = new short[] { (short) 1, (short) -1 };
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
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false, 210, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-192), 111);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", (-129));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        char[] charArray12 = new char[] { 'a', '4', '4', ' ', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray12);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (java.lang.CharSequence) " \n\r\n \r\r \r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "\r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        boolean[] booleanArray3 = new boolean[] { false, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  ", false, 70, charSequence3, (-326), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        char[] charArray5 = new char[] { '4', 'a', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", pattern1, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", 2, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass13 = byteArray0.getClass();
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!  hi!   hi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 193 + "'", int3 == 193);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        long[] longArray5 = new long[] { (-19), 100, '\000', '#', (-1) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[-19, 100, 0, 35, -1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", (java.lang.CharSequence) "hi!hi!  hi!   hi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", false, 90, (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (int) ' ', (-11));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        char[] charArray8 = new char[] { '4', 'a', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }
}

