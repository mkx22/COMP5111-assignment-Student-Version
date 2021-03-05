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
        long[] longArray3 = new long[] { 100, 100, 0L };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass8 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) "       \n ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        char[] charArray3 = new char[] { '#' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \r ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \r   ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \r   ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \r   ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \r,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        short[] shortArray2 = new short[] { (short) 10, (byte) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        java.lang.Class<?> wildcardClass4 = shortArray2.getClass();
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 139 + "'", int1 == 139);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, charSequence1, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", 9, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", 677, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r ", pattern1, "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n  \r \r   \n \r\n     \n  \r \n ", " \n  \r \r ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("         \r    \r \r   \n \r\n     \n  \r \n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", " \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \r\n ", charArray8);
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        double[] doubleArray3 = new double[] { 0L, (byte) -1, 100.0f };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, -1.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r ", "   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  h  i  !     ", (int) '\000', (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 7 + "'", int10 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \r ", "", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (-8), 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n \r ", (java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    \r    \n  \r \n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  , \r,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", "\n \r \r \r ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", false, 31, (java.lang.CharSequence) " \r h \r i \r ! \r   \r ", 14, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int[] intArray1 = new int[] { 'a' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r        \n ", (int) '\r', 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", pattern1, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        long[] longArray3 = new long[] { 9, 14, (byte) 100 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[9, 14, 100]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "  \r \r \r   \n \r\n ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int[] intArray1 = new int[] { 'a' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence3, charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r ", "\n", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 27, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", 100, 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true, (-4), (java.lang.CharSequence) "  \r ", (-72), 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray1 = new int[] { 'a' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", true, 20, (java.lang.CharSequence) " \n  \r \r ", 37, 37);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r \r ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        float[] floatArray5 = new float[] { (-22), (-19), 94, 0.0f, 9 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-22.0, -19.0, 94.0, 0.0, 9.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  " + "'", str3, " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        char[] charArray7 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "\r" };
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray1);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray1);
        java.lang.Class<?> wildcardClass6 = charSequenceArray1.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", "  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", pattern1, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "\n \r \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "    \r       \r     \r \r  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-27) + "'", int3 == (-27));
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \r \r \r ", "    \r       \r   \n \r\n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  ,  ,  , \r,  , \r,  ,  , \r,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r ", 27, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \n ", 19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", " \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:           ?  ? ?   ? ??     ?  ? ?              ?  ? ?   ? ??     ?  ? ?    ?       ?  ? ?   ? ??     ?  ? ? ?        ?  ? ?   ? ??     ?  ? ?  ?       ?  ? ?   ? ??     ?  ? ?           ?  ? ?   ? ??     ?  ? ?              ?  ? ?   ? ??     ?  ? ?    ?       ?  ? ?   ? ??     ?  ? ? ?        ?  ? ?   ? ??     ?  ? ?  ?       ?  ? ?   ? ??     ?  ? ?           ?  ? ?   ? ??     ?  ? ?              ?  ? ?   ? ??     ?  ? ?    ?       ?  ? ?   ? ??     ?  ? ? ?        ?  ? ?   ? ??     ?  ? ?  ?       ?  ? ?   ? ??     ?  ? ?           ?  ? ?   ? ??     ?  ? ?              ?  ? ?   ? ??     ?  ? ?    ?       ?  ? ?   ? ??     ?  ? ? ?        ?  ? ?   ? ??     ?  ? ?  ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", false, 16, (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", 72, (-12));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        boolean[] booleanArray3 = new boolean[] { false, true, false };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, false]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", false, 7, (java.lang.CharSequence) " \r \r \r ", (-13), (-103));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence1);
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", 46, (-36));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", 26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        long[] longArray6 = new long[] { 20, 34, (short) 10, (byte) 0, 16, (byte) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[20, 34, 10, 0, 16, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r \r \r   \n \r\n ", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r \r \r ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "\n ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", "    \r    \n  \r \n ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        char[] charArray6 = new char[] { 'a', '\r', '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a\r4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a\r4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, \r, 4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        char[] charArray8 = new char[] { '\r', '\n', '\n', 'a', '\n' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \n, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (-444), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "  \r \r        \n ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        char[] charArray2 = new char[] { '#' };
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[#]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n \r \r \r ", " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "       \n ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) " \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r ", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 355 + "'", int1 == 355);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", pattern1, "\n \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   \n ", "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", "  \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 9, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \r\n ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true, (int) (short) -1, (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 69, 139);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n \r ", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r " + "'", str3, " \n \r ");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 373 + "'", int1 == 373);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray5);
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
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (-103), 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h  i  !     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", true, 373, (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", 0, 444);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (-5), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r \r \r ", pattern1, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \r \r \r   \n \r\n ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r \r   \n \r\n " + "'", str3, "  \r \r \r   \n \r\n ");
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:     ?    ?  ? ?      ?    ?  ? ? ?    ?    ?  ? ?      ?    ?  ? ? ?    ?    ?  ? ?      ?    ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequence0);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "  \r \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  ,  ,  , \n,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n ", (-444));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "  \r \r        \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n  \r \r   \n \r\n     \n  \r \n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "  \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "    \r       \r   \n \r\n  \r \n ", "   \r   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!", "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        char[] charArray7 = new char[] { '\r', '\n', '\n', 'a', '\n' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, \n, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        double[] doubleArray4 = new double[] { (-1.0d), 'a', 0L, (-1L) };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 97.0, 0.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", pattern1, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r     \r \r  \r \n ", pattern1, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-113) + "'", int3 == (-113));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   ", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   " + "'", str3, "   \r   ");
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", "    \r       \r     \r \r  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 1, (short) 1, (byte) 1, (byte) -1, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 1, 1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \r   \n \r\n ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "   \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "   \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r h \r i \r ! \r   \r ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", true, 94, (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", 60, 91);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-69) + "'", int3 == (-69));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "       \n ", true, 3, charSequence3, (-629), 713);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", 26, 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray8);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray8);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n \r\n ", "  \n  \r \r   \n \r\n ", "hi!", "   \r   \n \r\n ", "   \r   \n \r\n ", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 476, 478);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "\n \r \r \r ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        byte[] byteArray0 = new byte[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \r \r \r ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-122) + "'", int3 == (-122));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  , \r,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 675 + "'", int3 == 675);
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int[] intArray6 = new int[] { 16, (-94), (short) 100, (byte) 10, '4', 0 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[16, -94, 100, 10, 52, 0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false, (-90), (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 36, (-26));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", 36, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  , \r,  , \r,  , \r,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  , \n,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  , \r,  , \r,  , \r,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ,  , \r,  , \r,  , \r,  ,  , \r,  , \r,  , \r,  ,  ,  , \r,  , \r,  , \r,  ]");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        long[] longArray3 = new long[] { 100, 100, 0L };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[100, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", 29, (-444));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 14, (-16));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        long[] longArray3 = new long[] { (short) 10, '\n', (-72) };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass9 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, 10, -72]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  \n  \r \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", 677, (-6));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 339 + "'", int1 == 339);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    \r       \r   \n \r\n  \r \n ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-188) + "'", int3 == (-188));
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        char[] charArray6 = new char[] { 'a', ' ', '\n', 'a' };
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a \na");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a \na");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a,  , \n, a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 81);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r ", "", "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \r \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "  \r \r \r   \n \r\n ", " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  " + "'", str3, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "  h  i  !     ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
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
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r \r \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r", true, 13, (java.lang.CharSequence) "   \r   \n ", (int) '\n', 257);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r ", "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r " + "'", str3, " \r ");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\n" + "'", str5, "\n");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("   \r   ", "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        java.lang.Class<?> wildcardClass2 = shortArray0.getClass();
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n " + "'", str3, "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", (-19), 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", 675);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) " \n  \r \r ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", (-103));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r     \r \r  \r \n ", pattern1, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r       \r   \n \r\n  \r \n ", "  \r \r        \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 107, (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", 675, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-478) + "'", int3 == (-478));
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        byte[] byteArray3 = new byte[] { (byte) 100, (byte) 1, (byte) 10 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray3);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray3), "[100, 1, 10]");
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
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (int) (short) -1, 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ,  , h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", "\n \n \n \n\r\n \n \n \n\n\n \n", "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   \n \r\n ", true, (int) ' ', (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", 19, 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h  i  !     ", 256);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  \n  \r \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! " + "'", str3, "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "   \r   ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  h  i  !     ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h  i  !     ", "\n \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        boolean[] booleanArray2 = new boolean[] { true, false };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(booleanArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray2), "[true, false]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n " + "'", str3, "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r \r \r ", pattern1, "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r h \r i \r ! \r   \r ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r " + "'", str3, " \r h \r i \r ! \r   \r ");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r ", "    \r       \r   \n \r\n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        byte[] byteArray1 = new byte[] { (byte) 100 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[100]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        char[] charArray8 = new char[] { '\r', '\n', '\n', 'a', '\n' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \n, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 18, (-103));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "  \r \r        \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        double[] doubleArray5 = new double[] { ' ', (short) 10, '\n', (byte) 0, '\r' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[32.0, 10.0, 10.0, 0.0, 13.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r     \r \r  \r \n ", pattern1, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence3, charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r ", " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "   \r   \n ", "\n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n \r ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \n,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", charSequence1, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        float[] floatArray5 = new float[] { '#', 19, '\r', 100L, (short) 100 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[35.0, 19.0, 13.0, 100.0, 100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  ,  ,  ,  , \n,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 4, 677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("      \n  \r \r   \n \r\n     \n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:       ?  ? ?   ? ??     ?  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 373, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", pattern1, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", 373);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "       \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n " + "'", str3, "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "  h  i  !     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n \r ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', "\r" };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray10);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[a, \r]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[a, \r]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        char[] charArray13 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray13);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray13);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray13);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray13);
        boolean boolean23 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "\r", "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \n \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", (java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ", (-8));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", 19, 355);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
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
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        long[] longArray6 = new long[] { ' ', (byte) 100, 100L, 0L, '\r', (short) 10 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass9 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[32, 100, 100, 0, 13, 10]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r     \r \r  \r \n ", pattern1, "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "    \r    \n  \r \n      \r    \n  \r \n \n    \r    \n  \r \n      \r    \n  \r \n \r    \r    \n  \r \n      \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n ", " \r ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "  \r ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        double[] doubleArray1 = new double[] { 31 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[31.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", pattern1, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n " + "'", str3, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "    \r    \n  \r \n ", false, 107, (java.lang.CharSequence) "       \n ", 373, 13);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        float[] floatArray1 = new float[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass9 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", " \n  \r \r ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r ", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", false, 94, (java.lang.CharSequence) "       \n ", 88, (-16));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "    \r    \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        double[] doubleArray4 = new double[] { (-36), (-113), 9, '\000' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray4);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-36.0, -113.0, 9.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   ", (-6), 675);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (int) (byte) -1, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n ", "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! " + "'", str3, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        float[] floatArray3 = new float[] { '\000', 100, '#' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray3);
        org.junit.Assert.assertNotNull(floatArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray3), "[0.0, 100.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-355) + "'", int3 == (-355));
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 114 + "'", int1 == 114);
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "   \r   \n \r\n ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", false, 16, (java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", 78, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r ", " \n  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 8 + "'", int3 == 8);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", pattern1, " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n " + "'", str3, "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", 675);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  hi!  hi!   ? ?        ? hi!   ? ?        ? hi!    ?   hi!  hi!  hi!  hi!   ? ?        ? hi!  hi!    ?   hi!   ? ?        ? hi!  hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 113);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        char[] charArray13 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray13);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray13);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray13);
        int int20 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (-69));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", (-113));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("    \r       \r   \n \r\n  \r \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:     ?       ?   ? ??  ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, 91, (java.lang.CharSequence) " \r ", 257, 257);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  h  i  !     ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   h  i  !     ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n", "\n \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (-8));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        char[] charArray10 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", charArray10);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray10);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
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
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str16 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n" + "'", str15, "\n");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n" + "'", str16, "\n");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \n       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n \r       \n  \r \r   \n \r\n   \n \r\n     \n  \r \n         \n  \r \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r ", "\r", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  " + "'", str3, "           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n  ");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "   \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \r \r \r ", 20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r ", "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[#]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "  \r \r        \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (-7));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n \r\n ", "  \n  \r \r   \n \r\n ", "hi!", "   \r   \n \r\n ", "   \r   \n \r\n ", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", false, 339, (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 713, (-122));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (int) (byte) -1, (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n " + "'", str3, "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", (-629));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", pattern1, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n     \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", pattern1, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n " + "'", str3, "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", "hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi! \nhi! \nhi!           \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r     hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 556 + "'", int3 == 556);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", pattern1, "  \r \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        char[] charArray5 = new char[] { 'a', '\r', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "a\r4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "a\r4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[a, \r, 4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  h  i  !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }
}

