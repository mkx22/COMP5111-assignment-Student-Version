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
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (-22), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-3));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        char[] charArray7 = new char[] { ' ', ' ', '#', '4', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 67 + "'", int3 == 67);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 88, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 453, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 19, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n ", "\r\n \n \n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) -1, (byte) 1, (byte) 100, (byte) 0, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        java.lang.Class<?> wildcardClass12 = byteArray6.getClass();
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[100, -1, 1, 100, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        java.lang.Class<?> wildcardClass19 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 5, (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (-452), (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 452 + "'", int1 == 452);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 15, (-393));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n", 16, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi! hi!hi!\nhi!hi! hi!hi!", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi! hi!hi!\nhi!hi! hi!hi!" + "'", str3, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", true, 0, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", 3, 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hi!", 493);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, 10, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r", "\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 453);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", false, (-21), (java.lang.CharSequence) "\r\r\n", (-91), (-94));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 27, 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", pattern1, "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 183 + "'", int1 == 183);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n", 23, (-94));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\n \n \n \n\n \n \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 103 + "'", int3 == 103);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (-1), (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, 22, (java.lang.CharSequence) "hi!hi!", (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r", "\n\r\r", "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (byte) 100, 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (java.lang.CharSequence) "", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray4);
        java.lang.Class<?> wildcardClass11 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 452);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\r", 67, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (-393));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r", (java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray13);
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
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", " \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", 44, 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n \n \n \n\n \n \n ", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 15, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 86, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\r", "", "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-401) + "'", int3 == (-401));
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 0, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charSequence1, (-452));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) (byte) 0, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", 21, 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) " \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\r", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\rh\ri\r!\r\r\r", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n,  , \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n, \n, \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n,  , \n, h, \n, i, \n, !, \n, h, \n, i, \n, !, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\n\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!\nhi!hi! hi!hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 88);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\r\n", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        boolean[] booleanArray6 = new boolean[] { false, false, true, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean12);
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", false, 8, charSequence3, 30, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r", false, 7, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) (short) 100, (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray12);
        java.lang.Class<?> wildcardClass20 = charArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-452), 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r\n", (-14), (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\r", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray12);
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
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (-43));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !, \r, \r,  , h, i, !, h, i, !, \n, h, i, !, h, i, !,  , h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!hi!\r", (-401));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!\r", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 19, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 787 + "'", int3 == 787);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false, 13, (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-2), 2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", false, 23, (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", 67, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (-45));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", true, 787, (java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (-21), (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\n \n \n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-313) + "'", int3 == (-313));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        short[] shortArray4 = new short[] { (short) 1, (short) -1, (short) 1, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        java.lang.Class<?> wildcardClass9 = shortArray4.getClass();
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!", "\r\n \n \n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        long[] longArray2 = new long[] { (short) 1, 0 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r", true, (-393), (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 0, 67);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, i, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, h, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, i, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, !, \r, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !, \n, h, i, !, h, i, !]");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", 493, 196);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 63 + "'", int1 == 63);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, 27, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (int) ' ', 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", false, (int) (byte) 0, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (-401), (-91));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!hi!\r", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (int) (byte) 1, 452);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true, (int) (byte) 1, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", 94, 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        double[] doubleArray4 = new double[] { (-1.0f), 100.0f, 3, 7 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 100.0, 3.0, 7.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false, 3, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (int) 'a', 63);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 183);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", true, 453, (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-6), (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        short[] shortArray2 = new short[] { (short) 10, (short) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass5 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", "\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi! hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", 91, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n ", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", true, 94, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 493, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        short[] shortArray4 = new short[] { (short) 1, (short) -1, (short) 1, (byte) 0 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[1, -1, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi! hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (-14));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true, 8, (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", 48, 24);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", 86);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        double[] doubleArray4 = new double[] { (byte) 0, (short) -1, 1, 16 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[0.0, -1.0, 1.0, 16.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hi!hi!\r", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charSequence1, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-453) + "'", int3 == (-453));
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi! hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!??? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!?hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? hi!hi!hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n", 5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 9, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray4);
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
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r" + "'", str3, "hi!hi!\r");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", 196);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", true, (int) (byte) -1, (java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", 21, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r", false, 27, (java.lang.CharSequence) "hi!hi!hi!\r", (int) (byte) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\r\r\n", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", pattern1, "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 7, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r", "hi!hi! hi!hi!\nhi!hi! hi!hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r" + "'", str3, "hi!hi!hi!\r");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        char[] charArray11 = new char[] { ' ', ' ', '#', '4', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 29 + "'", int3 == 29);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!hi! hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27) + "'", int3 == (-27));
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false, (-453), (java.lang.CharSequence) "\n\r\r", 0, 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", pattern1, " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true, 10, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (-27), (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n " + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 477 + "'", int1 == 477);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        char[] charArray7 = new char[] { ' ', ' ', '#', '4', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 44, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r\r", "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (-3), (-91));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", false, (int) (byte) 10, (java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (int) (short) -1, (-43));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n ", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n ", (int) (short) 1, 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\r", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r" + "'", str3, "\n\r\r");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-94), (-44));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", "\n", "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!" + "'", str3, "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        char[] charArray9 = new char[] { ' ', ' ', '#', '4', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r", (int) (short) 0, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 873 + "'", int1 == 873);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!?hi!hi! hi!hi!  ?  hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi!  ? ? hi!hi!?hi!hi! hi!hi!hi!hi!  ?  hi!hi!hi!hi!  ? ?  ?  hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi!  ? ? hi!hi!?hi!hi! hi!hi!hi!hi! hi!hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\n \n \n \n\n \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        java.lang.CharSequence charSequence0 = null;
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length(charSequence0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        byte[] byteArray1 = new byte[] { (byte) 1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        java.lang.Class<?> wildcardClass6 = byteArray1.getClass();
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.Class<?> wildcardClass8 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 54 + "'", int1 == 54);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r", "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\rh\ri\r!\r\r\r", "\n\r\r", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\rh\ri\r!\r\r\r" + "'", str3, "\rh\ri\r!\rh\ri\r!\r\r\r");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", false, 91, (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", 0, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n ", "", "hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r" + "'", str3, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "hi!hi!hi!\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 103);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r\r", 873);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", "hi!hi!\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 122 + "'", int3 == 122);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", 452, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n ", "\r\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r" + "'", str3, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", " ", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-24) + "'", int3 == (-24));
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\r", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hi!");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\n \n \n \n\n \n \n ", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi! hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r" + "'", str3, "\r\r");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!\r", (-21), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\n", (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hi!", (-94), 477);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\r", true, (int) (byte) 10, (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", 23, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", false, (int) 'a', (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", (-44), 51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", pattern1, "\r\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 426 + "'", int1 == 426);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\r", "\n\r\r", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        char[] charArray8 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n ", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!hi!\r", " \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n ", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n " + "'", str3, " \n ");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray13 = new char[] { ' ', ' ', '#', '4', '#' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray13);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray13);
        int int21 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray13);
        boolean boolean22 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", (-313));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?   h i ! h i ! h i ! h i !   h i ! h i ! ? ?   h i ! h i ! ? h i ! h i !   h i ! h i ! ?   h i ! h i ! h i ! h i !   h i ! h i ! ? ?   h i ! h i ! ? h i ! h i !   h i ! h i ! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\n\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", (java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true, (-72), (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", (int) 'a', 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 15, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        char[] charArray10 = new char[] { ' ', ' ', '#', '4', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hi! hi!hi!\nhi!hi! hi!hi!", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        char[] charArray8 = new char[] { ' ', ' ', '#', '4', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!" + "'", str3, "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 787 + "'", int1 == 787);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\rhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", 122);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", pattern1, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r" + "'", str3, "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", pattern1, "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! " + "'", str3, " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r", (java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r\r\n\r\n\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n\n \n \n \nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!", "\n\r\r hi!hi!\nhi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!", (-401));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hi!hi!\r\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", true, 100, (java.lang.CharSequence) "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!\r hi!hi!\r\nhi!hi!\r hi!hi!\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r\n", "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " ", false, (int) '#', (java.lang.CharSequence) "hi!", 493, 103);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (-3), (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!hi!hi! hi!hi!\rh\ri\r!\rh\ri\r!\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!h? hi!hi!?hi!hi! hi!hi!i? hi!hi!?hi!hi! hi!hi!!? hi!hi!?hi!hi! hi!hi!?? hi!hi!?hi!hi! hi!hi!? ? ? ?? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str2 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray0);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray0);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray0);
        java.lang.Class<?> wildcardClass9 = strArray0.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", (java.lang.CharSequence) " ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 15 + "'", int3 == 15);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\nhi!hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-86) + "'", int3 == (-86));
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", (java.lang.CharSequence) "\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi!  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi!  \n  hi!hi!hi!hi!  \n \r  \n  hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi!  \n \r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n" + "'", str3, "\n\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rh\ri\r!\rh\ri\r!\r\r\r\n\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r\r\rh\ri\r!\rh\ri\r!\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\n \n \n \n\n \n \n ", pattern1, "hi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\n \n \n \n\n \n \n " + "'", str3, "\r\n \n \n \n\n \n \n ");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!", pattern1, "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!" + "'", str3, "hi!hi!\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\r\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!\r\n \n \n \n\n \n \n hi!hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!", "\rh\ri\r!\rh\ri\r!\r\r\r", "\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!h\n\r\r hi!hi!\nhi!hi! hi!hi!i\n\r\r hi!hi!\nhi!hi! hi!hi!!\n\r\r hi!hi!\nhi!hi! hi!hi!\r\n\r\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!hi!hi! hi!hi!\nhi!hi! hi!hi! hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi! hi!hi!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!\r\nhi!hi!\nhi!hi!\nhi!hi! hi!hi!\nhi!hi!\nhi!hi!\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!h\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!i\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!!\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", "\n\r\n \nh\ni\n!\nh\ni\n!\n\n\nh\ni\n!\nh\ni\n!\n \nh\ni\n!\nh\ni\n!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        byte[] byteArray6 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 1, (byte) 100, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[1, -1, -1, 1, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\n", charArray12);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", charArray12);
        java.lang.Class<?> wildcardClass21 = charArray12.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!", pattern1, "\r hi!hi!\nhi!hi! hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!" + "'", str3, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!", " \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! \r   h i ! h i ! h i ! h i !   h i ! h i ! \r \r   h i ! h i ! \n h i ! h i !   h i ! h i ! ", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!" + "'", str3, "\r\nhi!hi!\nhi!hi!\nhi!hi!\n\nhi!hi!\nhi!hi!\nhi!hi!");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!", pattern1, "\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi! hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\n\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!" + "'", str3, "\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\r\r\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!\nhi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\r hi!hi!hi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!hi!hi!");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        char[] charArray12 = new char[] { ' ', ' ', '#', '4', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray12);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\r\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!\r\nhi!hi!\nhi!hi!\nhi!hi!\r\r\nhi!hi!\nhi!hi!\nhi!hi!hi!hi!", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!h\r hi!hi!\nhi!hi! hi!hi!i\r hi!hi!\nhi!hi! hi!hi!!\r hi!hi!\nhi!hi! hi!hi!\r\r hi!hi!\nhi!hi! hi!hi!\n \n \n \n\n \n \n ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "  #4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[ ,  , #, 4, #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }
}

