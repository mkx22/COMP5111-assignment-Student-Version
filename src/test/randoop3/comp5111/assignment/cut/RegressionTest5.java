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
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , \r,  ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", 81);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        long[] longArray6 = new long[] { (short) 0, '\n', (byte) 0, '#', (byte) -1, (byte) 100 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass15 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[0, 10, 0, 35, -1, 100]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n", "  \r \r        \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", 27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (-94), 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (int) (short) -1, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (-16));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass10 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ? ? ?   ? ? ?   ? ? ?   ? ? ? ? ? ? ?   ? ? ?   ? ? ?   ? ? ?  ? ? ?  ? ? ?   ? ? ? ? ? ? ?   ? ? ?   ? ? ?   ? ? ? ? ? ? ?   ? ? ?   ? ? ?   ? ? ?  ? ? ?  ? ? ?   ? ? ?   ? ? ?   ? ? ?   ? ? ?   ? ? ? ? ? ? ?   ? ? ?   ? ? ?   ? ? ?  ? ? ?  ? ? ?   ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 713, 713);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-3));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        long[] longArray3 = new long[] { 10L, (-7), 16 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray3);
        org.junit.Assert.assertNotNull(longArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray3), "[10, -7, 16]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r   \n \r\n  \r \n ", pattern1, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\n \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-8) + "'", int3 == (-8));
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray8 = new char[] { '\r', '\n', '\n', 'a', '\n' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "\r\n\na\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[\r, \n, \n, a, \n]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-72), 158);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", 37, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \r \r        \n ", (java.lang.CharSequence) "    \r    \n  \r \n ", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n ", pattern1, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n " + "'", str3, "   \r   \n \r\n ");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", pattern1, "hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! " + "'", str3, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  h  i  !     ", "    \r       \r   \n \r\n  \r \n ", "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h  i  !     " + "'", str3, "  h  i  !     ");
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", true, (int) ' ', (java.lang.CharSequence) "\n", (-5), (-36));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n ", false, (-15), (java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 102, (-72));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  h  i  !     ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r \r \r \r \r ", false, 80, (java.lang.CharSequence) "hi!", 0, 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "  \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-4) + "'", int3 == (-4));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "   \r   ", (-16));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "", (-19), 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r ", false, (-15), (java.lang.CharSequence) " \n  \r \r ", 0, (-9));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r ", "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        short[] shortArray6 = new short[] { (byte) 1, (byte) 1, (short) 1, (byte) 1, (byte) -1, (short) -1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[1, 1, 1, 1, -1, -1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("         \r    \r \r   \n \r\n     \n  \r \n ", "hi!", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", pattern1, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", true, (-621), (java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", 91, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "  h  i  !     ", (java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("       \n ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r    \n  \r \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        float[] floatArray1 = new float[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", false, (int) '#', (java.lang.CharSequence) " \n  \r \r ", 100, 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false, (-16), (java.lang.CharSequence) " ", 476, 478);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "  \r ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 26 + "'", int3 == 26);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:       ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?   ? ??             ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?     ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ?   ? ??     ?   ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ?  ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?          ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ?     ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ?   ? ??     ?   ???            ?    ? ?   ? ??     ?  ? ? ?         ?    ? ?   ? ??     ?  ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 478, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", pattern1, "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n " + "'", str3, "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence1, charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r\n ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray12);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", charArray12);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        double[] doubleArray5 = new double[] { 100.0f, 0L, (byte) 0, '\r', '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 0.0, 0.0, 13.0, 35.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true, 113, (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) -1, (byte) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray6);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[-1, 100, 100, 100, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        boolean[] booleanArray1 = new boolean[] { true };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray1);
        org.junit.Assert.assertNotNull(booleanArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray1), "[true]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "hi! ", " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! " + "'", str3, " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", 0, 677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r    \n  \r \n ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 16 + "'", int3 == 16);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n ", 31, (-629));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        double[] doubleArray0 = new double[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray0);
        java.lang.Class<?> wildcardClass2 = doubleArray0.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        char[] charArray10 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray10);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray10);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray10);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r ", charArray10);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", charArray10);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", pattern1, "    \r       \r     \r \r  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (int) (byte) 0, 80);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean8);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("    \r       \r     \r \r  \r \n ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (java.lang.CharSequence) "    \r    \n  \r \n ", 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:        ?    ?  ? ?    ?     ?    ?  ? ? ?        ?    ?  ? ?    ?     ?    ?  ? ? ?     ?    ?  ? ?        ?    ?  ? ?    ?     ?    ?  ? ? ?     ?    ?  ? ?        ?    ?  ? ?    ?     ?    ?  ? ? ?     ?    ?  ? ?        ?    ?  ? ?    ?     ?    ?  ? ? ?        ?    ?  ? ?    ?     ?    ?  ? ? ?        ?    ?  ? ?    ?     ?    ?  ? ? ? ?       ?    ?  ? ?    ?     ?    ?  ? ? ?     ?    ?  ? ? ?       ?    ?  ? ?    ?     ?    ?  ? ? ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int[] intArray1 = new int[] { 'a' };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r ", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  h  i  !     ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r     \r \r  \r \n ", "  \r \r \r   \n \r\n ", "    \r    \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \n\n\r   \n \r\n ", "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 53 + "'", int1 == 53);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 139 + "'", int1 == 139);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n  \r \r   \n \r\n     \n  \r \n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n  \r \r   \n \r\n     \n  \r \n " + "'", str3, "      \n  \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \r \r \r ", (java.lang.CharSequence) "  \r ", 113);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", " \r \r \r \r \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", 26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 89 + "'", int1 == 89);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", pattern1, "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n " + "'", str3, "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  h  i  !     ", 677);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 107);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "   \r   \n ", true, 0, (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", 4, 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        short[] shortArray2 = new short[] { (short) 10, (byte) 10 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray2);
        org.junit.Assert.assertNotNull(shortArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray2), "[10, 10]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r ", " \r \r \r ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r " + "'", str3, " \n  \r \r ");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        float[] floatArray5 = new float[] { (-22), (-19), 94, 0.0f, 9 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        java.lang.Class<?> wildcardClass10 = floatArray5.getClass();
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[-22.0, -19.0, 94.0, 0.0, 9.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \r \r ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r \r " + "'", str3, "  \r \r ");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 46, 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r    \n  \r \n ", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r ", charArray4);
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
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("    \r       \r   \n \r\n  \r \n ", "  \r \r        \n ", "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n ", "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", " \r \r \r \r \r \r \r ", "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! " + "'", str3, "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", 22, 677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", 38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) 158);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        char[] charArray5 = new char[] { '#' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
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
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", pattern1, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n " + "'", str3, "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  h  i  !     ", charArray6);
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r    \n  \r \n ", "    \r       \r     \r \r  \r \n ", "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r    \n  \r \n " + "'", str3, "    \r    \n  \r \n ");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-103) + "'", int3 == (-103));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ? ? ? ??? ? ? ??? ?       ?       ?   ? ??  ? ?    ? ??    ?   ? ?? ?   ?   ? ?? ?   ?   ? ?? ?   ?   ? ??    ?   ? ??    ?   ? ?? ?   ?   ? ?? ??   ?   ? ?? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r " + "'", str3, " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray11);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \n  \r \r ", "  \r \r ", " \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \r " + "'", str3, " \n \r ");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "  \r ", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", pattern1, "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!" + "'", str3, "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", true, (-90), (java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (int) '\n', 36);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray11);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        java.lang.Object[] objArray10 = new java.lang.Object[] { 'a', "\r" };
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray10);
        int int12 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) objArray10);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int[] intArray2 = new int[] { '\r', 2 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[13, 2]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \n  \r \r   \n \r\n ", pattern1, " \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n  \r \r   \n \r\n " + "'", str3, "  \n  \r \r   \n \r\n ");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 88 + "'", int3 == 88);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale(" \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:  ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ? ? ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?   ?  ? ? h ?  ? ? i ?  ? ? ! ?  ? ?   ?  ? ?     ?        ?    ?  ? ?   ?     ?    ?  ? ?  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ , \r,  ,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  , \r,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  , \r,  , \r,  , \r,  , \r,  ,  , \r,  ,  , \r,  , \n,  , \r,  , \r, \n,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  ,  , \r,  , \n,  , \r,  ,  , \r,  , \r,  , \r,  , \n,  , \r,  ]");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("  \r ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:   ? ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \r \r \r ", pattern1, " \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        char[] charArray7 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        java.lang.Class<?> wildcardClass11 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", " \r \r \r \r \r \r \r ", "  h  i  !     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
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
        java.lang.Class<?> wildcardClass14 = strArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (int) '4', 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        java.lang.Class<?> wildcardClass6 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (-103));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  h  i  !     ", "\n \n \n \n\r\n \n \n \n\n\n \n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "   \r   \n ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r ", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "   \r   \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "   \r   \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ,  ,  , \r,  ,  ,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        boolean[] booleanArray3 = new boolean[] { false, true, true };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray3);
        org.junit.Assert.assertNotNull(booleanArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray3), "[false, true, true]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \n \r ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        double[] doubleArray2 = new double[] { (byte) 0, 2 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[0.0, 2.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) " \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", (java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n " + "'", str3, "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n ", (java.lang.CharSequence) "    \r    \n  \r \n ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n ", pattern1, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) " \r ", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "hi! ", "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (java.lang.CharSequence) "\n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \r ", charArray6);
        java.lang.Class<?> wildcardClass12 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", pattern1, "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n " + "'", str3, "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (-15), (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  , \r,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \r, \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        boolean[] booleanArray6 = new boolean[] { true, false, false, true, true, true };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray6);
        org.junit.Assert.assertNotNull(booleanArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray6), "[true, false, false, true, true, true]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        int int2 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  ,  , h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 256 + "'", int3 == 256);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", 19, (-26));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray7);
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray4);
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", "       \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int[] intArray3 = new int[] { (-22), (-15), (byte) 1 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-22, -15, 1]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) " \r \r \r ", false, 713, (java.lang.CharSequence) "hi!", (-1), 33);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 91, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (-9));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray4);
        java.lang.Class<?> wildcardClass8 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        char[] charArray4 = new char[] { '#' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " \r \r \r ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), " \r \r \r ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), " \r \r \r ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ , \r,  , \r,  , \r,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n  \r \r   \n \r\n     \n  \r \n ", " \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n " + "'", str3, "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 94, 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (-9), 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format:        ?  ?  ?  ?  ?  ?  ?  ?  ? ? ?  ?  ?  ? ? ? ? ?  ?  ? ? ? ?? ?  ?  ?  ?  ? ? ?  ? ? ? ? ?   ? ?    ?  ?  ?  ?  ?  ?  ?  ?  ? ? ?  ?  ?  ? ? ? ? ?  ?  ? ? ? ?? ?  ?  ?  ?  ? ? ?  ? ? ? ? ?  ? ?  ?  ?  ?  ?  ?  ?  ?  ? ? ?  ?  ?  ? ? ? ? ?  ?  ? ? ? ?? ?  ?  ?  ?  ? ? ?  ? ? ? ? ?       ?  ?  ?  ?  ?  ?  ?  ?  ? ? ?  ?  ?  ? ? ? ? ?  ?  ? ? ? ?? ?  ?  ?  ?  ? ? ?  ? ? ? ? ?   ?  ?  ?  ?  ?  ?  ?  ?  ?  ? ? ?  ?  ?  ? ? ? ? ?  ?  ? ? ? ?? ?  ?  ?  ?  ? ? ?  ? ? ? ? ?  ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "  \n\n\r   \n \r\n ", (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \r\n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r \r \r ", pattern1, "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ", "", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", true, 38, (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 36, 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "  \r \r        \n ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r \r \r \r \r ", (java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   ", 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   ", "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-19) + "'", int3 == (-19));
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n ", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "       \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n" + "'", str13, "\n");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n " + "'", str3, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "\n", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ", "          \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n             \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n           \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \r        \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! " + "'", str3, "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) " \n \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        long[] longArray6 = new long[] { (-13), (-90), 100L, 91, (short) 10, 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-13, -90, 100, 91, 10, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\r", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", " \r \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 78 + "'", int3 == 78);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!  hi!  hi! \nhi! \nhi! \rhi!  hi!  hi!  hi! \nhi!  hi! \rhi! \nhi!  hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \n, h, i, !,  , \n, h, i, !,  , \r, h, i, !,  ,  , h, i, !,  ,  , h, i, !,  ,  , h, i, !,  , \n, h, i, !,  ,  , h, i, !,  , \r, h, i, !,  , \n, h, i, !,  ,  , h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", (-3));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 257, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (-13), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n " + "'", str3, "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", pattern1, "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n " + "'", str3, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray6);
        int int14 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray6);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", pattern1, "  \r \r        \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n " + "'", str3, "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        char[] charArray13 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray13);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray13);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray13);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray13);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray13);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray13);
        boolean boolean21 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", 91, (-7));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\n" + "'", str10, "\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\n" + "'", str11, "\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r\n ", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n \r\n ", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \r\n ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " \r \r \r ", (int) (short) 100, 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n", " \n \r ", "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", 3, 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("    \r       \r     \r \r  \r \n ", "    \r       \r   \n \r\n  \r \n ", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    \r       \r     \r \r  \r \n " + "'", str3, "    \r       \r     \r \r  \r \n ");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", false, (-19), (java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 0, (-15));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        char[] charArray6 = new char[] { '#' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[#]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", (-26), (-15));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \n ", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", (java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n ", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r \r \r \r \r ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "\n \r \r \r ", "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! " + "'", str3, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        byte[] byteArray4 = new byte[] { (byte) 0, (byte) 1, (byte) 1, (byte) -1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray4);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[0, 1, 1, -1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r " + "'", str3, " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \n  \r \r ", (java.lang.CharSequence) "  \n  \r \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n \r\n ", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", (java.lang.CharSequence) " \r \r \r ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "    \r       \r   \n \r\n  \r \n ", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("   \r   \n ", pattern1, "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n " + "'", str3, "   \r   \n ");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        char[] charArray8 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n ", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray8);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        char[] charArray12 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray12);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray12);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray12);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "   \r   \n ", charArray12);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ", charArray12);
        int int19 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \n  \r \r ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray12), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray12), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("         \r    \r \r   \n \r\n     \n  \r \n ", "         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \n ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \r \r        \n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "    \r    \n  \r \n ", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 629);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi! \rhi!  hi! \rhi!  hi! ", (java.lang.CharSequence) "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", 476);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r ", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[ ]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \r\n ", pattern1, "    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n \r    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r\n " + "'", str3, "\n \r\n ");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", "\n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! " + "'", str3, "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (int) (short) 1, 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        short[] shortArray0 = new short[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray0);
        org.junit.Assert.assertNotNull(shortArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n ", charArray11);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        double[] doubleArray6 = new double[] { 10, 81, (-3), 713, 31, (-15) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray6);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, 81.0, -3.0, 713.0, 31.0, -15.0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1), charArray2 };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray3);
        java.lang.Class<?> wildcardClass6 = objArray3.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1, [\n,  ]]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (int) 'a', 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \r h \r i \r ! \r   \r  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        char[] charArray9 = new char[] { '#' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n", charArray9);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        float[] floatArray1 = new float[] { (byte) 0 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        java.lang.Class<?> wildcardClass7 = floatArray1.getClass();
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        double[] doubleArray5 = new double[] { 1, 100.0f, (byte) 0, 100, (-1.0d) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 100.0, 0.0, 100.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", (int) (byte) 10, 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 80 + "'", int3 == 80);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\n \r \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-72) + "'", int3 == (-72));
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n \r\n ", (java.lang.CharSequence) "hi! hi! hi! \n\rhi! hi! hi! \n\nhi! hi!       \r       \r   hi! \rhi!  \r hi!    hi! \rhi!    \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi! \r   \r   hi! \rhi!    \r   hi! \rhi!    \r   hi! \rhi! hi!   \r   hi! \rhi! \rhi!   \r   hi! \rhi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", " \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \r\n ", " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) "       \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!", 476, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: hi!  hi!  hi!  ? hi!  hi!  ? hi!  hi! ");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        char[] charArray8 = new char[] { '#' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", charArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, (-26), 256);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int[] intArray5 = new int[] { '#', '4', (-1), '\000', '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray5);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 52, -1, 0, 52]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", pattern1, "      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r " + "'", str3, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 29, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !,  ,  , h, i, !,  ,  , h, i, !,  ,  , \r,  , h, i, !,  ,  , h, i, !,  ,  , \r,  , h, i, !,  ,  , h, i, !,  ]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        java.lang.CharSequence charSequence0 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "   \r   \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-22) + "'", int3 == (-22));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (-103), (-629));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n \r\n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) " \r ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("       \n ", " \r h \r i \r ! \r   \r ", "\n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \n " + "'", str3, "       \n ");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) "hi!", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\r   \n \r\n     \n  \r \n ", "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n " + "'", str3, "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray2);
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        java.lang.Class<?> wildcardClass6 = charArray2.getClass();
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\n", (java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", 677);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("    \r       \r     \r \r  \r \n ", " \n \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("   \r   \n \r\n ", " \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        char[] charArray9 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r \r \r ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "          \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n       \n  \r \r   \n \r\n     \n  \r \n           \n  \r \r   \n \r\n     \n  \r \n              \n  \r \r   \n \r\n     \n  \r \n    \n       \n  \r \r   \n \r\n     \n  \r \n \n        \n  \r \r   \n \r\n     \n  \r \n  \n ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        char[] charArray7 = new char[] { '#' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n ", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " \r ", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \r ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n \r \r \r ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", 85, 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (-3), 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true, 113, (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r     \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 53, 444);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", (java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", (-4));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        char[] charArray7 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) " ");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi! ", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ ]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 46);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", 38);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        java.lang.String[] strArray6 = new java.lang.String[] { "\n \r\n ", "  \n  \r \r   \n \r\n ", "hi!", "   \r   \n \r\n ", "   \r   \n \r\n ", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!", pattern1, " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n", "  \r \r \r   \n \r\n ", "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n" + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n ");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "    \r    \n  \r \n ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "   \r   \n ", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "    \r       \r     \r \r  \r \n ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "\n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[\n,  ]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", "    \r       \r     \r \r  \r \n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  " + "'", str3, "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", (java.lang.CharSequence) "hi!", (-103));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!       \r   \n \r\n    hi!  hi!  hi!  hi! \nhi!  hi!       \r   \n \r\n    hi! \nhi!  hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("  \r ", pattern1, "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \r " + "'", str3, "  \r ");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", 6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", (java.lang.CharSequence) "  h  i  !     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("  h  i  !     ", "  \r \r \r   \n \r\n ", "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  h  i  !     " + "'", str3, "  h  i  !     ");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "   \r   ", (-8));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "   \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n ", (java.lang.CharSequence) "  \r \r \r   \n \r\n ", 16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) int9);
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
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, true, (-621), (java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 6, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        java.lang.String[] strArray4 = new java.lang.String[] { " ", "", "hi!", " " };
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "  \r \r ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n  \r \r ", (java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray2);
        java.lang.Class<?> wildcardClass5 = charArray2.getClass();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) wildcardClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) " \n \r ", (java.lang.CharSequence) "  \r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        char[] charArray8 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " \n \r ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        char[] charArray7 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare(" \r \r \r ", "\n \r\n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi! ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        char[] charArray9 = new char[] { ' ', '#', '\n', '\n', '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\n ", charArray9);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "   \r   ", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi! hi! hi! hi!\rhi! hi! hi! hi!hhi!ihi!!hi! hi!\nhi!hhi!ihi!!hi! hi! hi!hhi!ihi!!hi! hi!", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " #\n\n4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , #, \n, \n, 4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 88 + "'", int14 == 88);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ", pattern1, "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n " + "'", str3, "      \n    \r   \n \r\n     \r   \n \r\n     \r   \n \r\n \r   \r   \n \r\n     \r   \n \r\n \r   \n \r\n     \n  \r \n ");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "   \r   \n ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "       \n ", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "    \r    \n  \r \n ", (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ", "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! " + "'", str3, "hi!  hi!  hi!   \r \r        \n hi!   \r \r        \n hi!    \r   hi!  hi!  hi!  hi!   \r \r        \n hi!  hi!    \r   hi!   \r \r        \n hi!  hi! ");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", (java.lang.CharSequence) " \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \r \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r \n \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r   \n  \r \r h \n  \r \r i \n  \r \r ! \n  \r \r   \n  \r \r ", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        int int3 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r \r    \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  \r \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r       \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r   \r  \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r  ", 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "     \r   \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[ ,  ,  ,  ,  , \r,  ,  ,  , \n,  , \n, \r,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  , \r,  ,  ,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", (java.lang.CharSequence) "   \r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("  \r \r \r   \n \r\n ", " \r \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "       \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n        \r    \n  \r \n    \n     \r    \n  \r \n \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n     \r    \n  \r \n \n       \r    \n  \r \n    \n     \r    \n  \r \n \n ", (int) '#', 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \n\n\r   \n \r\n ", (java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "  \r \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", pattern1, "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!", "hi! ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        java.lang.String[] strArray3 = new java.lang.String[] { "\n", "\n", " " };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\n" + "'", str8, "\n");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\n" + "'", str9, "\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ", "      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", " \n  \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n " + "'", str3, "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n ");
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        char[] charArray11 = new char[] { '4', '\000', '#', '\000', ' ' };
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray11);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray11);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r ", charArray11);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!  hi!  hi! \nhi! \nhi!    \r   hi!  hi!  hi!  hi! \nhi!  hi!    \r   hi! \nhi!  hi! ", charArray11);
        java.lang.Class<?> wildcardClass18 = charArray11.getClass();
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4\000#\000 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4, \000, #, \000,  ]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("   \r   ", "  \r ", "\n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  " + "'", str3, " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "  \r \r \r   \n \r\n ", (-3), 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "  \n  \r \r   \n \r\n ", 256);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ", pattern1, "       \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  " + "'", str3, " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ");
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "         \n \n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", (java.lang.CharSequence) " \r  \r  \r  \r  \r  \r  \r  \r  \r \r \r  \r  \r  \r \r \r \r \r  \r  \r \n \r \r\n \r  \r  \r  \r  \r \n \r  \r \r \r \n \r ", 257);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("      \n  \r \r   \n \r\n     \n  \r \n ", " \n  \r \r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) " \n \n \n \n\r\n \n \n \n\n\n \n       \r     \r \n    \n \r\n \r\r\r\n\r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern(" \r h \r i \r ! \r   \r ", "hi! ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r h \r i \r ! \r   \r " + "'", str3, " \r h \r i \r ! \r   \r ");
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("      \n   \r   \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n   \n \r\n     \n  \r \n ", "  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 22 + "'", int3 == 22);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll(" \r \r \r ", " \n \r ", "   \r   \n \r\n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " \r \r \r " + "'", str3, " \r \r \r ");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n ", "  \n  \r \r   \n \r\n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n " + "'", str3, "\n ");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("  \n\n\r   \n \r\n ", pattern1, "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  \n\n\r   \n \r\n " + "'", str3, "  \n\n\r   \n \r\n ");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        java.lang.CharSequence charSequence3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "  \r \r        \n ", false, 22, charSequence3, 33, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"substring\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "    \r       \r   \n \r\n  \r \n ", 22);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "  \r \r \r   \n \r\n ", charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\n", "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", " \r \r \r \r \r \r \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "  \n\n\r   \n \r\n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        short[] shortArray6 = new short[] { (short) 100, (byte) -1, (byte) 100, (byte) 10, (byte) 100, (short) 1 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray6);
        org.junit.Assert.assertNotNull(shortArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray6), "[100, -1, 100, 10, 100, 1]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, 713);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\n \n \n \n\r\n \n \n \n\n\n \n       \r       \r   \n \r\n  \r \n    \n \r\n    \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n \r   \r   \n \r\n    \r   \n \r\n    \r   \n \r\n \n   \r   \n \r\n \r\n   \r   \n \r\n  \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\r\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n\n\n \n \n \n\r\n \n \n \n\n\n \n \n \n \n \n\r\n \n \n \n\n\n \n", true, (int) (short) 100, (java.lang.CharSequence) "    \r        \r    \n  \r \n   \r     \r    \n  \r \n  ", (-444), (-16));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!", false, 0, (java.lang.CharSequence) "   \r   \n ", 10, 60);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "         \r    \r \r   \n \r\n     \n  \r \n ");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "      \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "         \r    \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[ ,  ,  ,  ,  ,  ,  ,  ,  , \r,  ,  ,  ,  , \r,  , \r,  ,  ,  , \n,  , \r, \n,  ,  ,  ,  ,  , \n,  ,  , \r,  , \n,  ]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "      \n  \r \r   \n \r\n     \n  \r \n ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r \n \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r   \r \r \r \r \r \r \r   \r \r \r   \r \r \r   \r \r \r  \r \r \r  \r \r \r   \r \r \r ", (java.lang.CharSequence) "hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!  hi!  hi!  \r hi!  hi!  \r hi!  hi! ", 31, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "      \n\n\r                \n  \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n   \n \n\r             \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n  \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n          \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n     \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \r   \n \r\n     \n   \n\n\r            \r    \r \r   \n \r\n     \n  \r \n \r         \r    \r \r   \n \r\n     \n  \r \n \n ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\n \r \r \r ", "       \n        \n        \n \n\r       \n        \n        \n \n\n       \n        \n       \r       \r          \n \r       \n  \r        \n           \n \r       \n    \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n \r   \r          \n \r       \n    \r          \n \r       \n    \r          \n \r       \n        \n   \r          \n \r       \n \r       \n   \r          \n \r       \n ", " \r h \r i \r ! \r   \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n \r \r \r " + "'", str3, "\n \r \r \r ");
    }
}

