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
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", 23, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        float[] floatArray1 = new float[] { 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\r", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r ", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r ");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        boolean[] booleanArray5 = new boolean[] { true, false, true, false, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[true, false, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  ", "hi!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "hi!hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n" + "'", str3, "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n hi!\n hi!\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n hi!\n hi!\n" + "'", str3, "hi!\n hi!\n hi!\n");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", 213);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-31), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!    ", (-180));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "                   ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        double[] doubleArray3 = new double[] { (short) 1, 1, 100.0d };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[1.0, 1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        java.lang.Class<?> wildcardClass7 = charSequenceArray1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r \r \r ", false, (int) (short) 100, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", 63, 133);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  ", false, (-2), (java.lang.CharSequence) "hi! ", 15, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r  \r \r \r \r\n\r\n\r\n \r \r ", pattern1, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r  \r \r \r \r\n\r\n\r\n \r \r " + "'", str3, "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 72, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        char[] charArray13 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\nhi!\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", true, 9, (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 0, 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", " \r \r \r ", "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '#', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  \n \n \n \n \n \nhi!", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!    ", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", "                   ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) "hi!\n", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n", " \r\n   \n   \n   \n\r \r \r \r ", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\nhi!\n", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n", "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "hi!\n", " \n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r" + "'", str3, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r ", 22, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { '#', 'a', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   ", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "hi!\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass14 = strArray4.getClass();
        char[] charArray20 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray20);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray20);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray20);
        int int24 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r  \r \r \r ", charArray20);
        long[] longArray28 = new long[] { (-3), (-1L), 91 };
        boolean boolean29 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray28);
        boolean boolean30 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray28);
        byte[] byteArray34 = new byte[] { (byte) 1, (byte) 10, (byte) 1 };
        boolean boolean35 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray34);
        boolean boolean36 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray34);
        boolean boolean37 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray34);
        boolean boolean38 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray34);
        boolean boolean39 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { strArray4, charArray20, longArray28, boolean39 };
        boolean boolean41 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[\r]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(longArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray28), "[-3, -1, 91]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray34), "[1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[[hi!,  , ,  ], [\r], [-3, -1, 91], false]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        long[] longArray1 = new long[] { '\000' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        short[] shortArray1 = new short[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray7);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "                   ", charArray7);
        java.lang.Class<?> wildcardClass16 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", "\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n" + "'", str3, "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        short[] shortArray2 = new short[] { (short) 1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\nhi!\n", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\rhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n                   \n                   \n                   \n \r ", "\n                   \n                   \n                   \n \r ", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r  \r \r \r ", pattern1, "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r \r \r " + "'", str3, " \r  \r \r \r ");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   ", true, 19, (java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 102, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '#', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!\rhi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r ", true, 76, (java.lang.CharSequence) "\n   \n   \n   \n\r ", 32, 62);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!??hi!??hi!??hi!? hi!??hi!? hi!??hi!? hi!??hi!??hi!??hi!? hi!??hi!? hi!??hi!? hi!??hi!??hi!??hi!? hi!??hi!? hi!??hi!? hi!??hi!??hi!??hi!??hi!??hi!? hi!??hi!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (int) (short) 100, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", " \r \r \r   \r \r \r ", "    h    i    !    \n    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r" + "'", str3, "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    h    i    !    \n    ", pattern1, " \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    " + "'", str3, "    h    i    !    \n    ");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r \r \r ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n, \r, \n, \r, \n, \r, \n,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r ", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "hi!hi!\n   \n   \n   \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        long[] longArray1 = new long[] { '\000' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "    h    i    !    \n    ", "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        float[] floatArray5 = new float[] { 33, 615, 213, 100, 94 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[33.0, 615.0, 213.0, 100.0, 94.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r \r \r ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", " \r\n   \n   \n   \n\r \r \r \r ", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  \n \n \n \n \n \nhi!", "    h    i    !    \n    ", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", (java.lang.CharSequence) "    h    i    !    \n    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
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
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n   \n   \n   \n", "  \r \r \r ", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        java.lang.CharSequence charSequence6 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence6, charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , \n,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , \n,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , \n,  , \r,  ]");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r\n   \n   \n   \n\r \r \r \r ", pattern1, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r " + "'", str3, " \r\n   \n   \n   \n\r \r \r \r ");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  ", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", pattern1, "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r" + "'", str3, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!\n\nhi!\n", "hi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", " \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", " \n\nhi!\n", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n   \n   \n   \n", (-22));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (-180));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        char[] charArray9 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r \r \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", " ", "\r", "\r", "" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (-7), (java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (int) '\000', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '#', 'a', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence2, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    h    i    !    \n    ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 0, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "\n                   \n                   \n                   \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        char[] charArray9 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!\n\nhi!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\r\n\r\n\r\n", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r \r \r ", 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r \r \r ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n, \r, \n, \r, \n, \r, \n,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", (java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (-65), (java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 0, (-72));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", 127);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 19 + "'", int1 == 19);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r \r \r ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n   \n   \n   \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n   \n   \n   \n\r ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n   \n   \n   \n\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n   \n   \n   \n\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ,  ,  , \n,  ,  ,  , \n,  ,  ,  , \n, \r,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", pattern1, "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n" + "'", str3, "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", true, (int) (short) -1, (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (-76), 32);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence4, charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\rhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "  \r  \r \r \r \r\n\r\n\r\n \r \r ", "                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\n\r\n\r\n\r\n", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 1, 10]");
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
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!    ", true, 4, (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", 1, 132);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        boolean[] booleanArray4 = new boolean[] { true, true, true, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[true, true, true, true]");
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
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) booleanArray0);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    h    i    !    \n    ", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    " + "'", str3, "    h    i    !    \n    ");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!    ", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!    " + "'", str3, "hi!    ");
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!    ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", true, (-22), (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", 15, 213);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, 213, (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 100, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "\n   \n   \n   \n\r ", 213);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n                   \n                   \n                   \n \r ", " \r\n   \n   \n   \n\r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!", " \r ", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", " \r \r \r ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! " + "'", str3, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   ", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!", pattern1, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!" + "'", str3, "hi!\rhi!");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    ", "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "    ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (java.lang.CharSequence) "\r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "                   ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence5, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r ", "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 13, charSequence3, 559, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  \n \n \n \n \n \nhi!", (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        char[] charArray13 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray13);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray13);
        boolean boolean24 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r" + "'", str3, "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 116, (java.lang.CharSequence) "\n \n \n \n", (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, " \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\nhi!\n", true, (int) (short) 1, (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", 639, 62);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r   \r \r \r ", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", "\n \n \n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r ");
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    ", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r,  ,  , \r,  , \r,  , \r,  , \r, \n, \r, \n, \r, \n,  , \r,  , \r,  ]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \n, \r, \n, \r, \n, \r, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, \r, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "\n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        boolean[] booleanArray6 = new boolean[] { true, false, true, false, false, false };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        java.lang.Class<?> wildcardClass13 = booleanArray6.getClass();
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, true, false, false, false]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\n\nhi!\n", "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, \n, \n, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str17 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", true, 351, (java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", 76, 63);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\nhi!\n", " ", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n" + "'", str3, " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\n\nhi!\n", "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\nhi!\n", (java.lang.CharSequence) " \r \r \r   \r \r \r ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        char[] charArray10 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 40, (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", 72, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", pattern1, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n" + "'", str3, "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", false, 31, (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", 40, 69);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 639, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-559) + "'", int3 == (-559));
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n   \n   \n   \n", pattern1, "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n   \n   \n   \n" + "'", str3, "\n   \n   \n   \n");
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\r\n\r\n", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("                   ", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\rhi!", pattern1, "  \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\rhi!" + "'", str3, "hi!hi!\rhi!");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    ", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, h, i, !, h, i, !, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, \n, \n, h, i, !, h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r \r ", (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        int[] intArray3 = new int[] { '\000', '\000', (byte) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n\r\n\r\n \r \r ", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r " + "'", str3, " \n\r\n\r\n\r\n \r \r ");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n" + "'", str3, "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", pattern1, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   ", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", 40, (-559));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!    ", (int) '\000', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\nhi!\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \n, h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n\nhi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\nhi!\n", (-13), (-559));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", "\n", "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", true, 40, (java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", (-5), (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r ", 10, 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) " \r \r \r   \r \r \r ", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 213, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r ", (int) (byte) -1, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        long[] longArray1 = new long[] { (-94) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-94]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 1, (byte) 10 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        java.lang.Class<?> wildcardClass7 = byteArray4.getClass();
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[-1, 1, 1, 10]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        long[] longArray6 = new long[] { '#', 16, 10L, 5, 10, 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass9 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[35, 16, 10, 5, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray4);
        java.lang.Class<?> wildcardClass10 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r \r ", " \r\n   \n   \n   \n\r \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", (java.lang.CharSequence) "  \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\n\r\n\r\n\r\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " \n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n", " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!" + "'", str3, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?    h    i    !    ?    ?    h    i    !    ?    ?    h    i    !    ?    ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (java.lang.CharSequence) "", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", pattern1, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r \r ", 15, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r  \r \r \r ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 14, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "    ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        char[] charArray8 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!", " \r  \r \r \r ", "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("                   ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                   " + "'", str3, "                   ");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n", (java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", 639);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r   \r \r \r ", " \n\r\n\r\n\r\n \r \r ", "hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r ");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (java.lang.CharSequence) "hi!    ", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!", (-496));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", pattern1, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!" + "'", str3, "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", true, 7, charSequence3, (-94), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n   \n   \n   \n", (java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int[] intArray4 = new int[] { (byte) 1, ' ', 4, (byte) 100 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 32, 4, 100]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int[] intArray5 = new int[] { '\000', (byte) 100, (byte) 10, '\r', (byte) 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100, 10, 13, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, (-9), (java.lang.CharSequence) "", 24, (-10));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "                   ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "                   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "                   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!    ", charSequence1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !, h, i, !, \r, h, i, !, \r, h, i, !, \r, h, i, !]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "   ", "hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n" + "'", str3, "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!    ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r ", 22, (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", "\n \n \n \n", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        char[] charArray9 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", " \r \r \r ", "hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n" + "'", str3, "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "                   ", false, 615, (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!", (int) (byte) 0, 72);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n", "hi!\rhi!\rhi!\rhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 102);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n   \n   \n   \n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?   ?   ?   ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        char[] charArray8 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    h    i    !    \n    ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 23 + "'", int10 == 23);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??????? ??????????????? ??????????????? ??????????????? ???????");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    h    i    !    \n    ", "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n   \n   \n   \n\r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-92) + "'", int3 == (-92));
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \r \r \r ", (-180));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        int[] intArray4 = new int[] { (byte) 0, 8, 179, 9 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 8, 179, 9]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", 72, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r ", 76, (-63));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n,  ,  ,  ,  , h,  ,  ,  ,  , i,  ,  ,  ,  , !,  ,  ,  ,  , \n,  ,  ,  ,  , \n]");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n                   \n                   \n                   \n \r ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!    ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", "hi!hi!\n   \n   \n   \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!", 559, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "hi!", 133);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        long[] longArray3 = new long[] { (-3), (-1L), 91 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass7 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-3, -1, 91]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", (java.lang.CharSequence) "                   ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 132, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray5);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 180 + "'", int1 == 180);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r \r \r ", false, 69, charSequence3, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r \r \r ", "\n \n \n \n", " \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r " + "'", str3, "  \r \r \r ");
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "hi!    ", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { '#', 'a', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rhi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#a4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#, a, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", pattern1, "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! " + "'", str3, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\nhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) "\n                   \n                   \n                   \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int[] intArray4 = new int[] { 3, (byte) 0, (short) 1, 94 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[3, 0, 1, 94]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "                   ", (java.lang.CharSequence) "  \r \r \r ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", pattern1, "hi!  \n \n \n \n \n \nhi!hhi!  \n \n \n \n \n \nhi!ihi!  \n \n \n \n \n \nhi!!hi!  \n \n \n \n \n \nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n" + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", (java.lang.CharSequence) "hi!", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", " \r\n   \n   \n   \n\r \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", "    ", " \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!", (java.lang.CharSequence) "hi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 0, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rhi!", "\n   \n   \n   \n", "hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n hi!\n\nhi!\n\nhi!\n\nhi!\n\rhi!\n\nhi!\n hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rhi!" + "'", str3, "hi!\rhi!");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        java.lang.String[] strArray1 = new java.lang.String[] { "\n" };
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray1);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r   \r \r \r ", pattern1, "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r ");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n", " \n\r\n\r\n\r\n \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "\nhi!hi!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    h    i    !    \n    ", (java.lang.CharSequence) "    \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", (java.lang.CharSequence) "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  \n \n \n \n \n \nhi!", "\r", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  \n \n \n \n \n \nhi!" + "'", str3, "hi!  \n \n \n \n \n \nhi!");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        long[] longArray3 = new long[] { 8, (-5), (-13) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[8, -5, -13]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\n\r\n\r\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\n   \n   \n   \nhi!", (java.lang.CharSequence) "hi!\n hi!\n hi!\n", 76);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        long[] longArray6 = new long[] { 16, (-1), (short) 1, 3, (short) 10, '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[16, -1, 1, 3, 10, 35]");
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
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r ", " \r  \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-7) + "'", int3 == (-7));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r   \r \r \r ", "hi!\n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n                   \n                   \n                   \n \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?                   ?                   ?                   ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r ", (-5));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r \r \r   \r \r \r ", (java.lang.CharSequence) "hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n", charSequence1, (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n", (java.lang.CharSequence) "hi! ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r ", (-496));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", " ", "", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        char[] charArray9 = new char[] { ' ', '#', '4', 'a', '#', '\r' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #4a#\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, 4, a, #, \r]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   ", " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", "\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n\r\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nh\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\ni\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n!\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\rhi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n, \r, \n,  , \n, \r, \n, \r, \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n hi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n\rhi!\nhhi!\nihi!\n!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n hi!\n hi!\n", (java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!", 559);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi! hi!\rhi!", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!hi!\n   \n   \n   \nhi!", "  \r  \r \r \r \r\n\r\n\r\n \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ", "  \r \r \r ", "hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r " + "'", str3, "\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \r ");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) -1, (byte) 1, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 0, 0, -1, 1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\n\nhi!\n", " \r\n   \n   \n   \n\r \r \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\nhi!\n", " \r ", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\nhi!\n" + "'", str3, " \n\nhi!\n");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n", pattern1, "hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi!\rhi! hi!\rhi!\rhi!\rhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n" + "'", str3, " \n\r\n\r\n\r\n \r \r \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n\r\n\r\n\r\n\r\n \n\r\n\r\n\r\n");
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int[] intArray4 = new int[] { 3, (byte) 0, (short) 1, 94 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[3, 0, 1, 94]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        char[] charArray11 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", (-180), 351);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n hi!\n hi!\n", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\rh\ri\r!\r\n\r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n\r\n\r\n \r \r ", 5, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n\r\n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n \n    h    i    !    \n    \n    h    i    !    \n    \n    h    i    !    \n    \n", "hi!hi!\rhi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi!  hi!  hi!  hi! \nhi! ", "hi!\n\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", (-65), 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 5, (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        char[] charArray11 = new char[] { '4', '#', '#', ' ', ' ', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!\n\nhi!\rhi!\rhi!\rhi!\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\r\n\r\n", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n \n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n\n\n \n \n \nh\n \n \n \ni\n \n \n \n!\n \n \n \n \n \n \n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4##   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, #, #,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! ", "\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n h\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n i\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n !\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\nhi!\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    h    i    !    \n    ", 133, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\nh \n\nhi!\n \n\nhi!\ni \n\nhi!\n \n\nhi!\n! \n\nhi!\n \n\nhi!\n\n \n\nhi!\n \n\nhi!\n\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        java.lang.String[] strArray5 = new java.lang.String[] { " ", "", "", " ", "hi!" };
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!hi!hi!\rhi!\rhi!\rhi!hi!\rhi!\rhi!\rhi!", (java.lang.CharSequence) "\n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\nhi!\n", 76);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        int[] intArray4 = new int[] { 3, (byte) 0, (short) 1, 94 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[3, 0, 1, 94]");
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
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\rh\ri\r!\rhi!hi!\rhi!\rhi!hi!\rhi!\r", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence4, charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "                   ", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!hi!\n   \n   \n   \nhi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!\n hi!\n hi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

