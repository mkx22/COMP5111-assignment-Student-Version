package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (-43));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n ", "\r\r\n", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) 'a', 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n \n \n \n\n \n \n ", "hi!", " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 14, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!", (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\r\n \n \n \n\n \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-14) + "'", int3 == (-14));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r", "hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (-43));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.Object[] objArray0 = new java.lang.Object[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray0), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\r\n");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \r, \n]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, 0, (java.lang.CharSequence) "\r\r\n", 94, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!\r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hi!\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? ?? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true, 14, (java.lang.CharSequence) "\r\r", 27, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", true, (int) '#', (java.lang.CharSequence) "hi!", 6, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n ", true, (int) '\000', (java.lang.CharSequence) "hi!", 0, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 14, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n", (int) '#', (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r", 21, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r", "\r hi!hi!\nhi!hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hi!\nhi!hi! hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rh\ri\r!\r\r\r", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r", false, 7, (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", 19, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r", true, 22, (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 1, 7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi! hi!hi!\nhi!hi! hi!hi!", " \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!hi!", "\n", "\r", "\r" };
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true, 30, (java.lang.CharSequence) "hi!", (int) '#', (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r", pattern1, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\n", "hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r", "", "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (int) '4', (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 13, 91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, h, \r, i, \r, !, \r, h, \r, i, \r, !, \r, \r, \r]");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n \n \n \n\n \n \n ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 8, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (int) (byte) -1, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (-6), (-22));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "hi!hi!\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false, (-3), (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 8, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r", "\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\n", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", true, (int) (byte) 10, (java.lang.CharSequence) "\n\r\r", (-72), 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!", "\r", "\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-44) + "'", int3 == (-44));
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 48 + "'", int3 == 48);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (int) (short) 0, (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n ", "\r", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 100.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (-1), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 4, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r", "\n", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r", pattern1, "\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", 15, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\r\r", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-19));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 88);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (int) (byte) 100, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", false, 48, (java.lang.CharSequence) "hi!", (-72), (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n " + "'", str3, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 1, 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true, (int) (short) 0, (java.lang.CharSequence) "hi!hi!hi!\r", (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, (int) 'a', (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "\r", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (int) '\n', 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\n \n \n \n\n \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", "\rh\ri\r!\rh\ri\r!\r\r\r", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n ", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r", false, (int) '#', (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (int) (short) 0, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        long[] longArray3 = new long[] { (-1L), (short) -1, (-6) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        java.lang.Class<?> wildcardClass8 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, -6]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!hi!\r", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass10 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (byte) 0, 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (int) (byte) 100, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n ", (java.lang.CharSequence) "\r\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 393 + "'", int1 == 393);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-6), 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", true, (-1), (java.lang.CharSequence) " \n ", 7, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[false, false, true, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) (byte) -1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, (-94), (java.lang.CharSequence) "\n\r\r", (int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n ", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
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
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        double[] doubleArray0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 493 + "'", int3 == 493);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r", pattern1, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-21));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (int) (byte) 10, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-452) + "'", int3 == (-452));
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) (short) -1, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r", "hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 2, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false, 88, (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 12, 88);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\r", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r", "\r\r\n", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass13 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 72, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 493, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\r", (-14), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) '\r', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", true, 45, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 8, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false, (int) (short) 1, (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-21), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n ", "\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false, 393, (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 4, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!", false, 48, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 100, (-45));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (int) (short) 100, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (int) '\r', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 8, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 48, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray13);
        int int23 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-43), (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", false, (-6), (java.lang.CharSequence) "", 393, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true, 100, (java.lang.CharSequence) "hi!", (-452), (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        char[] charArray7 = new char[] { ' ', ' ', '#', '4', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 0, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false, 4, (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) '\000', (-44));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charSequence1, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n ", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 5, (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-393) + "'", int3 == (-393));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!", "", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 44, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        java.lang.Class<?> wildcardClass11 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 86);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r", true, (-1), (java.lang.CharSequence) "\n\r\r", 45, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", (int) (byte) 100, 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false, 27, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 86, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 196 + "'", int1 == 196);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 24, (-44));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r", "", "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) '\r', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (-14));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 0, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", true, 7, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 12, (-44));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n,  , \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n,  , \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? ?? ? ? ?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!????hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!\nhi!hi! hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (-44));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n", " \n ", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!\r", (-91), (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 4, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!\r", charArray12);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 21, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n", 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 493);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) " \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n \n \n \n\n \n \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!????hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!??hi!hi!?hi!hi!?hi!hi!???hi!hi!?hi!hi!?hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) '\000', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n" + "'", str3, "\r\r\n");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 183 + "'", int3 == 183);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, (-45), (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 0, (-44));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\r", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 100, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        char[] charArray0 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        java.lang.Class<?> wildcardClass2 = charArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "hi!hi!\r", " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-43), (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) ' ', 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        java.lang.Class<?> wildcardClass3 = doubleArray0.getClass();
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 453 + "'", int3 == 453);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", charSequence1, 88);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 45, 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false, 23, (java.lang.CharSequence) "hi!", (-2), (-393));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r", 6, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?? ?h?i?!?h?i?!???h?i?!?h?i?!? ?h?i?!?h?i?!?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, (int) '\r', (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 0, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", 1, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        char[] charArray0 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray0);
        java.lang.Class<?> wildcardClass3 = charArray0.getClass();
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray0), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 21, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\rh\ri\r!\r\r\r", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!\r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r\n \n \n \n\n \n \n ", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n " + "'", str3, "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (-45), 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        long[] longArray2 = new long[] { (short) 1, 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        long[] longArray3 = new long[] { (-1L), (short) -1, (-6) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-1, -1, -6]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", false, 14, (java.lang.CharSequence) "\r\r\n", (-7), 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n", (int) (byte) 100, 493);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\n \n \n \n\n \n \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        short[] shortArray4 = new short[] { (short) 100, (byte) -1, (short) 100, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[100, -1, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", 72, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }
}

