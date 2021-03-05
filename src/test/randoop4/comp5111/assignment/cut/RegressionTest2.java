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
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! \n  \n     \n  \n   \n\n  \n   \r", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "hi! ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", false, (int) (byte) 1, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", 4, 16);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        char[] charArray7 = new char[] { 'a', '4', '4', ' ', '#' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ??? ????? ????? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        double[] doubleArray2 = new double[] { (-1.0d), 0.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        java.lang.Class<?> wildcardClass6 = doubleArray2.getClass();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        char[] charArray8 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", false, (int) ' ', (java.lang.CharSequence) "", 72, 93);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        comp5111.assignment.cut.ToolBox.CharSequenceTools charSequenceTools0 = new comp5111.assignment.cut.ToolBox.CharSequenceTools();
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceTools0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", false, (-1), (java.lang.CharSequence) "\n\r\n", 91, (int) '\n');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r\r\n \r\r\r \r\r\n \r\r", "", "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", false, (-18), (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 359, 6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 14 + "'", int1 == 14);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r", "hi!", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n  \n     \n  \n   \n\n  \n   \r", "\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r", 12, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (-2), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", 0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "  \r\r  \r\n  \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", true, 0, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", false, 17, (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (-10), 8);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r\r  \r\n  \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?????????????????? ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ?????????????????? ???????????????? ???????????????? ??????????????????? ???????????????? ???????????????? ???????????????????? ???????????????? ???????????????? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", pattern1, "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 15, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \r\r  \r\n  \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ??  ??  ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        char[] charArray9 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", true, (int) (byte) 100, (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", 93, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", " \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-20) + "'", int3 == (-20));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", true, (-2), charSequence3, (-91), (-94));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (int) (byte) -1, 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \n     \n  \n   \n\n  \n   ", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", " \r\r\n \r\r\r \r\r\n \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "hi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        char[] charArray7 = new char[] { '\r', 'a', '4', '4', '4' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r\n \r\r\r \r\r\n \r\r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\n \r\r\r \r\r\n \r\r" + "'", str3, " \r\r\n \r\r\r \r\r\n \r\r");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n\r\n\n\r\r\n\r\n\n\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n", true, 18, (java.lang.CharSequence) "hi! ", (-22), 99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", false, (-91), charSequence3, 22, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", 17, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (int) (byte) 10, 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 93, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", (-94));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\n  \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        char[] charArray7 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r\r  \r\n  \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        char[] charArray7 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charSequence1, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi! ??hi! ??hi! ?h???hi! ??hi! ??hi! ?i???hi! ??hi! ??hi! ?!???hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi!", "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charSequence1, 93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n  \n     \n  \n   \n\n  \n   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ?     ?  ?   ??  ?   ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 20, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", true, (int) '4', (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 17, 93);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "", "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi! \r\rhi! \r\nhi! \r", pattern1, " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 91, 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\n  \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", pattern1, "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! ", charArray3);
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 17, 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi! \n  \n     \n  \n   \n\n  \n   \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", false, (int) (byte) 1, (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi! ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 20, 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (int) (short) 10, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-5) + "'", int3 == (-5));
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r", "hi! ", "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 6, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", 16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", pattern1, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114 + "'", int1 == 114);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 18 + "'", int1 == 18);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (-2), 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 114);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n", "hi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (int) (short) -1, (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (-94));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! \r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ??hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r\r  \r\n  \r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r\r  \r\n  \r" + "'", str3, "  \r\r  \r\n  \r");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", true, 94, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 72, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n", " ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-18) + "'", int3 == (-18));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (int) (short) 100, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true, (-3), (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 6, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 17, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   ", pattern1, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true, (-94), (java.lang.CharSequence) "hi! ", 22, (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r", (int) (byte) 1, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   ", "\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        char[] charArray7 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r" + "'", str3, "hi! \r");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 0, 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\n", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r\r", "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r", "hi! \r\rhi! \r\nhi! \r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-13) + "'", int3 == (-13));
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", " hi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r\r  \r\n  \r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\r\n\r\n\n\r", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        java.lang.Class<?> wildcardClass5 = byteArray0.getClass();
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " ", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 359);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r\r  \r\n  \r", (java.lang.CharSequence) "hi!", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n  \n     \n  \n   \n\n  \n   \r", "hi! \r\rhi! \r\nhi! \r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 20, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 93, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:    ? ? ?   ? ? ? ? ?   ? ? ? ? ?   ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! \r\rhi! \r\nhi! \r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ??hi! ??hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\r\n\r\n\n\r", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '\r', 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "hi! \r", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 43 + "'", int3 == 43);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", 2, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "  \r\r  \r\n  \r", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-193) + "'", int3 == (-193));
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-326) + "'", int3 == (-326));
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \n  \n     \n  \n   \n\n  \n   \r", " hi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   ", pattern1, " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", " hi! \r\rhi! \r\nhi! \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true, (int) (short) 0, (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (-193), (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r\r  \r\n  \r", (int) (byte) 1, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence5, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray7);
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
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\r  \r\n  \r", false, 20, (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 23, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", false, (int) (short) 100, (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 22, (-2));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", 9, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n", (-20));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        short[] shortArray1 = new short[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray1);
        org.junit.Assert.assertNotNull(shortArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray1), "[0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", pattern1, "hi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "  ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-5), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 17, 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "hi! ", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "\n\r\n", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray7);
        java.lang.Class<?> wildcardClass12 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
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
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false, (int) '4', (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", 9, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "  \r\r  \r\n  \r", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", true, (-326), (java.lang.CharSequence) "  \r\r  \r\n  \r", (int) (short) 10, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (-5), 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence2, charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (int) '\000', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 114);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 100, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        char[] charArray8 = new char[] { '\r', 'a', '4', '4', '4' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! ", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        boolean[] booleanArray4 = new boolean[] { false, true, true, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  ", false, (int) (byte) 1, (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", 93, 19);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 17, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        char[] charArray7 = new char[] { '\r', 'a', '4', '4', '4' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", 99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi! \r\rhi! \r\nhi! \r", pattern1, "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  ", (java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", " hi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (-20), 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (-20));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", true, 12, (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "hi! \r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r\r  \r\n  \r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" ", "hi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 72, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 5, 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", 14, 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-91), 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", pattern1, "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 359, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence1, charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", 23, (int) '\000');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        java.lang.Class<?> wildcardClass4 = doubleArray0.getClass();
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray0);
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, (-1), (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 8, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", true, (int) '#', (java.lang.CharSequence) "hi! \r", (-10), 29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", false, (int) (byte) 0, (java.lang.CharSequence) "  \r\r  \r\n  \r", 17, 128);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
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
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \n     \n  \n   \n\n  \n   ", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 210 + "'", int1 == 210);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  ", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        char[] charArray7 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "hi! \r\rhi! \r\nhi! \r\r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! " + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\rhi! \r\nhi! \r", "  ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-94), (-193));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 2, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! ", "", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!", 94);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "\n\r\n\n\r\r\n\r\n\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        char[] charArray5 = new char[] { '4', 'a', ' ' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n\n\r\r\n\r\n\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n", 94, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129 + "'", int1 == 129);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (int) (byte) 1, 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ??   ? ? ?   ? ? ? ? ?   ? ? ? ? ?   ? hi! ???hi! ??   ? ? ?   ? ? ? ? ?   ? ? ? ? ?   ? hi! ??");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 94, (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   ", "hi! \r", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", false, (int) (byte) 1, (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 19, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 10, (byte) 1, (byte) 100, (byte) 1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray5);
        java.lang.Class<?> wildcardClass9 = byteArray5.getClass();
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[1, 10, 1, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", 41, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r", pattern1, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", false, 16, (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (-22), (int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", 93, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r" + "'", str3, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }
}

