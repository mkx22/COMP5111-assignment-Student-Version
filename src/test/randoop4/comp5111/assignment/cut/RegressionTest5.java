package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???????????????????hi! ??hi! ?h???hi! ??hi! ??hi! ?i???hi! ??hi! ??hi! ?!???hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        char[] charArray5 = new char[] { '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\000]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \n  \n     \n  \n   \n\n  \n   \r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", " \n  \n     \n  \n   \n\n  \n   ", " \n\r\n \r\r \r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r" + "'", str3, "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        char[] charArray8 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (int) (short) 100, (-5));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n\r\n \r\r \r\n \r", 335, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r", 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-27), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        short[] shortArray5 = new short[] { (short) 10, (short) 0, (short) 10, (short) 100, (short) 100 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray5);
        org.junit.Assert.assertNotNull(shortArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray5), "[10, 0, 10, 100, 100]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (-4), 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! ", "  ", "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", pattern1, "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        double[] doubleArray6 = new double[] { '#', 1.0d, 0L, 100.0d, 100.0d, 10.0f };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 1.0, 0.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", false, 37, (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (int) (short) 10, (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        char[] charArray9 = new char[] { 'a', '4', '4', ' ', '#' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (-11));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\n \r\r \r\n \r", "\n\r\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        char[] charArray8 = new char[] { '\r', 'a', '4', '4', '4' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r", 0, 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r\r\n \r\r\r \r\r\n \r\r", "hi! \r\rhi! \r\nhi! \r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        double[] doubleArray1 = new double[] { 41 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray1), "[41.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray2);
        java.lang.Class<?> wildcardClass4 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \r, h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, \r, \n]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \n  \n     \n  \n   \n\n  \n   \r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi!", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) " hi!   hi!  \nhi!  ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        java.lang.Class<?> wildcardClass10 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r\n \r\r\r \r\r\n \r\r", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\n \r\r\r \r\r\n \r\r" + "'", str3, " \r\r\n \r\r\r \r\r\n \r\r");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-27), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (-91));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        double[] doubleArray5 = new double[] { 10, (byte) 100, '\r', 1L, 0 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 13.0, 1.0, 0.0]");
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", 128);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n  \n     \n  \n   \n\n  \n   ", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence1, charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        char[] charArray9 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (-22), 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", 1, 335);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "", true, 17, (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", 193, 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! ", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 359);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-1), (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true, 3, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 44, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" hi!   hi!  \nhi!  ", "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", 210);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 37 + "'", int1 == 37);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "  ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi! \r\rhi! \r\nhi! \r", "\n\r\n", " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\r,  , \r, \n, \r, \r, \r, \n, \r,  , \r, \r, \r, \r, \r, \n, \r, \r, \r, \n, \r,  , \r, \r, \r, \n, \r, \n, \r, \r, \r, \n, \r,  , \r, \r, \r]");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        double[] doubleArray2 = new double[] { (-1.0d), 0.0f };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[-1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "\n\r\n", "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        char[] charArray9 = new char[] { '\r', 'a', '4', '4', '4' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r\r  \r\n  \r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray9);
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 90 + "'", int3 == 90);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        double[] doubleArray5 = new double[] { 129, 10.0d, 193, 5, (short) -1 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[129.0, 10.0, 193.0, 5.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (-2));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, \r, h, \r, i, \r, !, \r,  , \r, \n, \r,  , \r,  , \r, \n, \r,  , \r,  , \r,  , \r,  , \r,  , \r, \n, \r,  , \r,  , \r, \n, \r,  , \r,  , \r,  , \r, \n, \r, \n, \r,  , \r,  , \r, \n, \r,  , \r,  , \r,  , \r, \r, \r, \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, h, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, i, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, !, \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r,  , \n, \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r]");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
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
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", 97);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        char[] charArray9 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        float[] floatArray4 = new float[] { (-3), 17, 91, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray4);
        org.junit.Assert.assertNotNull(floatArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray4), "[-3.0, 17.0, 91.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", pattern1, "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!   hi!  \nhi!  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", 0, (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 194);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\r", 93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", 25, 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        long[] longArray3 = new long[] { (-20), 100, 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-20, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        long[] longArray4 = new long[] { 10L, (short) -1, 10, 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray4);
        java.lang.Class<?> wildcardClass10 = longArray4.getClass();
        org.junit.Assert.assertNotNull(longArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray4), "[10, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (-326));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, " hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \r\r  \r\n  \r", (-129));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n,  , \r, \n, h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  , h, i, !,  , \r, \r]");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r\r  \r\n  \r", false, 91, (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (int) (byte) -1, 15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        char[] charArray8 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", pattern1, "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        char[] charArray11 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r", "", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "  ");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray7);
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
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 27 + "'", int1 == 27);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?????hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        int[] intArray1 = new int[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", true, 359, (java.lang.CharSequence) "\n\r\n", (-4), 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n" + "'", str3, "\n\r\n");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence4, charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\n  \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", pattern1, " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \n     \n  \n   \n\n  \n   ", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   " + "'", str3, " \n  \n     \n  \n   \n\n  \n   ");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", 15, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", (java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n\r\nhi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   ", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  ", "hi! \r\rhi! \r\nhi! \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\r\n", 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", false, 2, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 99, 23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass11 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 70 + "'", int1 == 70);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        char[] charArray7 = new char[] { ' ', '\000', '\000', 'a' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " \000\000a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " \000\000a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , \000, \000, a]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        float[] floatArray1 = new float[] { 18 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[18.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        char[] charArray6 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 44, (-129));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", pattern1, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        char[] charArray9 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("  \r\r  \r\n  \r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence6, charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence3, charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        java.lang.CharSequence charSequence0 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 359, 326);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        char[] charArray10 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ????h?i?!? ??? ? ??? ? ? ? ? ??? ? ??? ? ? ????? ? ??? ? ? ?????hi! ??hi! ?h???hi! ??hi! ??hi! ?i???hi! ??hi! ??hi! ?!???hi! ??hi! ??hi! ? ???hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int[] intArray5 = new int[] { 100, 1, '#', 100, '\000' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 35, 100, 0]");
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", pattern1, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r " + "'", str3, "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 8, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r,  ,  ,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \r,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \n,  , \n,  , \r,  , \n,  ,  ,  , \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  ,  ,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \r,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \n,  , \n,  , \r,  , \n,  ,  ,  , \r,  , h, i, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! ", false, 10, (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", (-111), 99);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!", (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "\n", "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " \n\r\n \r\r \r\n \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", pattern1, "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        char[] charArray10 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray10);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray10);
        java.lang.Class<?> wildcardClass18 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", " ", " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r" + "'", str3, "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", pattern1, "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", " ", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", " \n\r\n \r\r\n\r\n \r\n\n\r\n \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 0, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\n \r\r \r\n \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-5), (java.lang.CharSequence) "\n\r\n", 2, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 522 + "'", int1 == 522);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", pattern1, "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\r", pattern1, "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\r");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '\000', (-19));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (-10));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\n  \r", charArray11);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 522, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 94, 335);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \n, \r, \n,  , \r, \r, \n, \r, \n,  , \r, \n, \n, \r, \n,  , \r]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray1 = new int[] { (byte) -1 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray1.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", 114, 77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "  \r\r  \r\n  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        java.lang.Class<?> wildcardClass2 = charArray1.getClass();
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \r, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r]");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ???hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        long[] longArray2 = new long[] { (short) -1, ' ' };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[-1, 32]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", " \r\r\n \r\r\r \r\r\n \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 94, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        java.lang.String[] strArray4 = new java.lang.String[] { "\n\r\n", "hi! \r", "hi! ", "\n" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", true, (-94), (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (int) '4', (-3));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\rhi! \r\nhi! \r\r", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        char[] charArray10 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 65 + "'", int1 == 65);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n \r\r \r\n \r", "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r \r\n \r" + "'", str3, " \n\r\n \r\r \r\n \r");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        char[] charArray10 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi! \n  \n     \n  \n   \n\n  \n   \r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (-27));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray11 = new char[] { 'a', '4', '4', ' ', '#' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence2, charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", true, 4, (java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", 0, 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", false, (int) (byte) 100, (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", (-18), 326);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", 326, (-13));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        char[] charArray9 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        char[] charArray8 = new char[] { 'a', '4', '4', ' ', '#' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\r", (int) 'a', (-193));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        char[] charArray1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \n  \n     \n  \n   \n\n  \n   \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi! ??hi! ??hi! ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", charArray8);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\nhi! \r\rhi! \r\nhi! \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", 359, 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\n\r\n\n\n\n\r\n hi!   hi!  \nhi!  \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", 104);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        char[] charArray10 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\r\000\000##a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\r, \000, \000, #, #, a]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", (java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray4);
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        int[] intArray2 = new int[] { (short) 1, (-20) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -20]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray9 = new char[] { '\r', 'a', '4', '4', '4' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \n  \n     \n  \n   \n\n  \n   \r", "hi! \r\rhi! \r\nhi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 100, -1, 100]");
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
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", 24, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", (java.lang.CharSequence) "hi! \r", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        char[] charArray9 = new char[] { '\r', 'a', '4', '4', '4' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\nhi! \r\rhi! \r\nhi! \r\n hi! \r\rhi! \r\nhi! \r\n\rhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\rhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \r\r  \r\n  \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r,  ,  ,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \r,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \n,  , \n,  , \r,  , \n,  ,  ,  , \r,  , h, i, !,  , \r, \r, \r, h, i, !,  , \r, \r,  ,  ,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \r,  , \n,  , \r,  , \n,  ,  ,  , \r,  , \n,  , \n,  , \r,  , \n,  ,  ,  , \r,  , h, i, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        char[] charArray9 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        char[] charArray10 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        java.lang.Class<?> wildcardClass16 = charArray10.getClass();
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n  \n     \n  \n   \n\n  \n   \r", pattern1, "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n  \n     \n  \n   \n\n  \n   \r" + "'", str3, "hi! \n  \n     \n  \n   \n\n  \n   \r");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        char[] charArray10 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray10);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi! \r\rhi! \r\nhi! \r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        boolean[] booleanArray4 = new boolean[] { false, false, false, true };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray4);
        org.junit.Assert.assertNotNull(booleanArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray4), "[false, false, false, true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n\r\n", true, (int) (byte) 100, (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", (-10), (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        char[] charArray9 = new char[] { '#', ' ', '\r', '#', '\r', ' ' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  ", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# \r#\r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# \r#\r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , \r, #, \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r\r\n \r\r\r \r\r\n \r\r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r\r\n \r\r\r \r\r\n \r\r" + "'", str3, " \r\r\n \r\r\r \r\r\n \r\r");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        char[] charArray12 = new char[] { 'a', '4', '4', ' ', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r", pattern1, " \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r" + "'", str3, " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r");
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray10 = new char[] { '\r', '\000', '\000', '#', '#', 'a' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", charArray10);
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
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r", "hi! \r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", false, (-72), (java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 47, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " hi!   hi!  \nhi!  ", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", (java.lang.CharSequence) "\n\r\n", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-4), (-111));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 445 + "'", int3 == 445);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", (-5), 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " hi!   hi!  \nhi!  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , h, i, !,  ,  ,  , h, i, !,  ,  , \n, h, i, !,  ,  ]");
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence2, charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r\r  \r\n  \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
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
        java.lang.Class<?> wildcardClass13 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (-129), 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi!   hi!  \nhi!  ", "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi!   hi!  \nhi!  " + "'", str3, " hi!   hi!  \nhi!  ");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 93);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!", "hi!", "hi!" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", " \n\r\nhi! \r\rhi! \r\nhi! \r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r" + "'", str3, "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-114) + "'", int3 == (-114));
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        long[] longArray3 = new long[] { (-326), 72, 9 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        java.lang.Class<?> wildcardClass6 = longArray3.getClass();
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[-326, 72, 9]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n\r\n \r\r\n\r\n \r\n\n\r\n \r", pattern1, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n\r\n \r\r\n\r\n \r\n\n\r\n \r" + "'", str3, " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  , \r, \r, h, i, !,  , \r, \n, h, i, !,  , \r, \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 3, 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 107);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        char[] charArray6 = new char[] { '4', 'a', ' ' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 22 + "'", int10 == 22);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\n\n\r\r\n\r\n\n\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 94 + "'", int3 == 94);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", (-326));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        char[] charArray7 = new char[] { '\r', 'a', '4', '4', '4' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\ra444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\r, a, 4, 4, 4]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n\r\n \r\r \r\n \r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "\r", "\r", "\r" };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\r", (java.lang.CharSequence) " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" hi! \r\rhi! \r\nhi! \r", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi! \r\rhi! \r\nhi! \r" + "'", str3, " hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n\r\n \r\r\n\r\n \r\n\n\r\n \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        char[] charArray9 = new char[] { '\n', '\n', ' ', '4', '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "\n\n 4#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[\n, \n,  , 4, #]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (-72));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \r, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r, \n, \n, \r, \n, \n, \r, \r, \n, \r, \n, \n, \r, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! ", pattern1, "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! " + "'", str3, "hi! ");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        char[] charArray12 = new char[] { 'a', '4', '4', ' ', '#' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray12);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! ", charArray12);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray12);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "a44 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[a, 4, 4,  , #]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 93 + "'", int19 == 93);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", charArray4);
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
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r", 5, 17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", 25, 194);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", 70);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) " ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\n", 194, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", (java.lang.CharSequence) "\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\000\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \000, \000,  ]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", pattern1, "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   \n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        char[] charArray10 = new char[] { 'a', '4', '4', ' ', '#' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray10);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r\r\n \r\r\r \r\r\n \r\r", charArray10);
        java.lang.Class<?> wildcardClass17 = charArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r", pattern1, "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r" + "'", str3, "hi! \r\rhi! \r\nhi! \r\n \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", (int) '\r', (-21));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        double[] doubleArray6 = new double[] { '#', 1.0d, 0L, 100.0d, 100.0d, 10.0f };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        java.lang.Class<?> wildcardClass11 = doubleArray6.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[35.0, 1.0, 0.0, 100.0, 100.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n\r\n\n\r\r\n\r\n\n\r", (java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", " \n  \n     \n  \n   \n\n  \n   h \n  \n     \n  \n   \n\n  \n   i \n  \n     \n  \n   \n\n  \n   ! \n  \n     \n  \n   \n\n  \n     \n  \n     \n  \n   \n\n  \n   ", "hi! \r\rhi! \r\nhi! \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!  hi! hi! \n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\r\n\r\n\n\r\n\n\r\r\n\r\n\n\r \r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \rhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r\rhi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\r \r\n\r\r\r\n\r \r\r\r\r\r\n\r\r\r\n\r \r\r\r\n\r\n\r\r\r\n\r \r\r\r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r" + "'", str3, "hi!hi!  hi! \nhi! \rhi! \nhi!  hi! \rhi! \rhi! \nhi! \rhi! \nhi!  hi! \rhi! \nhi! \nhi! \rhi! \nhi!  hi! \rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n\r\n\n\r\n\n\r\r\n\r\n\n\r", "\n\r\n\rh\ri\r!\r \r\n\r \r \r\n\r \r \r \r \r \r\n\r \r \r\n\r \r \r \r\n\r\n\r \r \r\n\r \r \r \r\r\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r\r \r\rhi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\r\n\r\n\n\r" + "'", str3, "\n\r\n\n\r\n\n\r\r\n\r\n\n\r");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! \r\rhi! \r\nhi! \r", "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", "\n\r\n\n\r\r\n\r\n\n\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \r\rhi! \r\nhi! \r" + "'", str3, "hi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r\n", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \r", false, (-404), (java.lang.CharSequence) " ", 24, (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\nhi! \r\rhi! \r\nhi! \r", pattern1, "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String[] strArray3 = new java.lang.String[] { " ", "\n", "" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r", "\n\r\n\n\r\r\n\r\n\n\rh\n\r\n\n\r\r\n\r\n\n\ri\n\r\n\n\r\r\n\r\n\n\r!\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r \n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\r\n\n\r", "hi! \r\rhi! \r\nhi! \r\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r" + "'", str3, "hi! \n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r \r\rhi! \r\rhi! \r\nhi! \r \r\nhi! \r\rhi! \r\nhi! \r \r");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", 2, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        char[] charArray7 = new char[] { '\r', '\000', '\000', ' ' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r\rhi! \r\r   \n \r \n   \r \r \n \r \n   \r \n \n \r \n   \r hi! \r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
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
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        long[] longArray1 = new long[] { (-18) };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        java.lang.Class<?> wildcardClass6 = longArray1.getClass();
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[-18]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\nhi! \r\r\n \r\r\r \r\r\n \r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r \r\r\n \r\r\r \r\r\n \r\rhi! \r\r\n \r\r\r \r\r\n \r\r\r\r", (java.lang.CharSequence) "hi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r", " ", " \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r" + "'", str3, "\n\r\n\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\rhi! \r  \r\r \r  \rh \r  \r\r \r  \ri \r  \r\r \r  \r! \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r  \r  \r\r \r  \r\r \r  \r\r \r  \r\r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\n\r\nhi! \r\rhi! \r\nhi! \rh\n\r\nhi! \r\rhi! \r\nhi! \ri\n\r\nhi! \r\rhi! \r\nhi! \r!\n\r\nhi! \r\rhi! \r\nhi! \r \n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n\n\r\n\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\r\nhi! \r\rhi! \r\nhi! \r\n\n\n\r\nhi! \r\rhi! \r\nhi! \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \n  \n     \n  \n   \n\n  \n   \r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi! \r\r\nhi! \r\r\rhi! \r\r\nhi! \r\rhi! hi! \r\rhi! \r\nhi! \r", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \n     \n  \n   \n\n  \n   ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        short[] shortArray4 = new short[] { (short) -1, (short) 0, (short) 0, (short) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) shortArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[-1, 0, 0, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi! \r\nhi! \r\rhi! \r\nhi! \rhi! \r\r hi! \r\r\rhi! \r\r hi! \r\r\n\r\nhi! \r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\n\r\n\n\r\r\n\r\n\n\r\r\n\n\r\n\n\r\r\n\r\n\n\r\r\r\r hi! \r\r\rhi! \r\r hi! \r\r", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 64 + "'", int3 == 64);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "" };
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! ", 384);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi! ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi! \r", charArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }
}

