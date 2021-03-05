package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", 93, 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        long[] longArray5 = new long[] { 'a', (short) -1, (byte) 0, (byte) 100, 0L };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, -1, 0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r" + "'", str3, "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r" + "'", str3, "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!\r \r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", 407);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", 89);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", pattern1, " ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r " + "'", str3, "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("", "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n\r \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\r \r", 354);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", (-398));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", "hi!\n\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", "hi!\nhi!\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        float[] floatArray5 = new float[] { 13, 10.0f, (-13), 84, (short) 10 };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray5);
        org.junit.Assert.assertNotNull(floatArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray5), "[13.0, 10.0, -13.0, 84.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        long[] longArray5 = new long[] { 'a', (short) -1, (byte) 0, (byte) 100, 0L };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray5);
        int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray5);
        org.junit.Assert.assertNotNull(longArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray5), "[97, -1, 0, 100, 0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r \r", (java.lang.CharSequence) "hi!hhi!ihi!!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", "\r \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi! \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int[] intArray6 = new int[] { 48, 72, '4', (-19), 'a', 335 };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[48, 72, 52, -19, 97, 335]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", "\n", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r" + "'", str3, "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r");
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", 431);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \r ", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \r, \r, \r, \r, \r, \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 93 + "'", int4 == 93);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r", pattern1, "hi!\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r" + "'", str3, "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", (java.lang.CharSequence) "hi!hhi!ihi!!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", (-89));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", "hi!\r \r", "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r" + "'", str3, "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", "hi!hhi!ihi!!\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-94) + "'", int3 == (-94));
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\n", "hi!\r \r", "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n" + "'", str3, "hi!\n");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r \r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", pattern1, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        float[] floatArray2 = new float[] { 4, (short) 1 };
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
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[4.0, 1.0]");
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
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \r", false, 20, (java.lang.CharSequence) "hi!hhi!ihi!!hi!", 103, 415);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", "hi!\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int[] intArray0 = new int[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\r \r", "hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", 431);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", (java.lang.CharSequence) " ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 415 + "'", int3 == 415);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[h, i, !, \n, h, i, !,  , \r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, h, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, i, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, !, h, i, !, h, h, i, !, i, h, i, !, !, h, i, !, \n, \r, \r, \r]");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Class<?> wildcardClass2 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", "hi!hhi!ihi!!hi!\nhi! \r", "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r" + "'", str3, "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.Class<?> wildcardClass14 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", "hi!hhi!ihi!!hi!\n", "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r" + "'", str3, "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r");
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        double[] doubleArray2 = new double[] { 'a', (byte) -1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray2);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) doubleArray2);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray2), "[97.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", 319);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\n]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", (java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", false, (int) (byte) 0, (java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", (int) (byte) 0, (-89));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", pattern1, "hi!\nhi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r" + "'", str3, "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", 399, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", pattern1, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r" + "'", str3, "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\r \r", 15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", "hi!\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!", 0, (-89));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "hi!hhi!ihi!!hi!", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        char[] charArray2 = new char[] {};
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str13 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", pattern1, "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", true, (-89), (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", (int) (byte) 10, (-16));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        char[] charArray7 = new char[] { '4', '\r' };
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi! \r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, \r]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", 191);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        java.lang.CharSequence charSequence1 = null;
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charSequence1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", (int) '\000');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", true, (-18), (java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r", 103, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!", "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", 7, (-4));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        short[] shortArray4 = new short[] { (short) 10, (byte) 1, (byte) 0, (byte) 1 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(shortArray4);
        org.junit.Assert.assertNotNull(shortArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(shortArray4), "[10, 1, 0, 1]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int[] intArray1 = new int[] { 415 };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[415]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf(charSequence0, 80, 335);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \r", charArray9);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", charArray9);
        java.lang.Class<?> wildcardClass18 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r", "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "hi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r" + "'", str3, "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        long[] longArray2 = new long[] { 94, (-1L) };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray2);
        org.junit.Assert.assertNotNull(longArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray2), "[94, -1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r \r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r \r", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) " ", charArray5);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\r \rhi!\r \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!\nhi! \r", "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals(charSequence0, (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-84) + "'", int3 == (-84));
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", "hi!\nhi! \r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", "hi!\n\r \rhi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n" + "'", str3, "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", (java.lang.CharSequence) "hi!\nhi!", 397);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 12 + "'", int3 == 12);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        char[] charArray3 = new char[] {};
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", charArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", (-67));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", (-13), (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!hhi!ihi!!hi!", "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", "hi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!" + "'", str3, "hi!hhi!ihi!!hi!");
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (int) '\r');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\nhi!\r \r", "hi!\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r", pattern1, "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r" + "'", str3, "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r");
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi! \r ", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \r " + "'", str3, "hi!\nhi! \r ");
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", pattern1, "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        float[] floatArray2 = new float[] { '\r', 67 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray2);
        org.junit.Assert.assertNotNull(floatArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray2), "[13.0, 67.0]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray5);
        java.lang.Class<?> wildcardClass11 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", 1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        java.lang.Class<?> wildcardClass6 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        float[] floatArray1 = new float[] { 0L };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(floatArray1);
        org.junit.Assert.assertNotNull(floatArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(floatArray1), "[0.0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 411 + "'", int1 == 411);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\r \rhi!\r \r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi! \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", 85, (-84));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", (java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi! \r ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllUpperCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", (int) (byte) 0, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", 13, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "", "hi!\nhi! \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \r \r" + "'", str3, "hi!\nhi! \r \r");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[\r, h, \r, i, \r, !, \r, \n, \r, h, \r, i, \r, !, \r,  , \r, \r, \r]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", pattern1, "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) str10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst(" ", pattern1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r", pattern1, "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r" + "'", str3, "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r");
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        boolean[] booleanArray5 = new boolean[] { false, true, true, false, true };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray5);
        org.junit.Assert.assertNotNull(booleanArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray5), "[false, true, true, false, true]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        long[] longArray1 = new long[] { 1L };
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        int int5 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) longArray1);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray1);
        org.junit.Assert.assertNotNull(longArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray1), "[1]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\n\r \rhi!\r \r", 399);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\nhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\r \r", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (-187), 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", pattern1, "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, 0, (-398));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \r", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\nhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", true, 80, (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", 80, 20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhi!\r \r", "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi!\r \r" + "'", str3, "hi!\nhi!\r \r");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\n", "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\nhi! \r", "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhi! \r" + "'", str3, "hi!\nhi! \r");
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r \r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\r]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("", "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-407) + "'", int3 == (-407));
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\r \r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", pattern1, "hi!hhi!ihi!!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!hhi!ihi!!\r \r", pattern1, "hi!\n\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!\r \r" + "'", str3, "hi!hhi!ihi!!\r \r");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \r", 399, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str8 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass12 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", (int) (short) -1, 320);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        char[] charArray5 = new char[] { '4', '\r' };
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi! \r", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4, \r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut(charSequence0, charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        java.lang.Class<?> wildcardClass9 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \r", (java.lang.CharSequence) "hi!\nhi! \r ", (-67));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) byteArray2);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 1]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\r", "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", "hi!hhi!ihi!!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\r \r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", pattern1, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r" + "'", str3, "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n\r \r", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence1, charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray5);
        java.lang.Class<?> wildcardClass10 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", pattern1, "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        double[] doubleArray5 = new double[] { 94, (-187), 1.0d, 319, (-72) };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray5);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[94.0, -187.0, 1.0, 319.0, -72.0]");
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
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 333 + "'", int1 == 333);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str12 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str15 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!", "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-194) + "'", int3 == (-194));
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf(charSequence0, (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi! \r ", "", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        java.lang.Class<?> wildcardClass8 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r", (java.lang.CharSequence) "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (-52));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r \r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compareIgnoreCase("hi!\nhi!\r \r", " ", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 72 + "'", int3 == 72);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("", "hi!\nhi! \r \r", "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", (java.lang.CharSequence) "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", (-81));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \r", (-406));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", (java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isCreatable("\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        char[] charArray4 = new char[] {};
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!\r \r", charArray4);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\r \rhi!\r \r", 80, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("", "\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3) + "'", int3 == (-3));
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n", charArray7);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", true, (-4), (java.lang.CharSequence) "\n", 333, 9);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\n", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "\r", "hi!" };
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray2);
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) charSequenceArray2);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray2);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray2);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", 93, 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\n");
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", charArray4);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        int[] intArray6 = new int[] { (short) 0, 100, '\n', (short) 10, (short) -1, (-1) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, 100, 10, 10, -1, -1]");
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
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\r", (-12), (-12));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        java.lang.CharSequence charSequence1 = null;
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", false, 20, (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (-320), (-67));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("\r", "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-102) + "'", int3 == (-102));
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r" + "'", str3, "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhi! \r \r", false, (-67), (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (-22), (-22));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", (java.lang.CharSequence) "hi!\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n\r", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) " ", (int) '\n', 411);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r \r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "hi!\n\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "hi!\n\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[h, i, !, \n, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r", 354, (int) '\r');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches(charSequence0, false, (-6), (java.lang.CharSequence) "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", 431, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.length()\" because \"cs\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (java.lang.CharSequence) "", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 85 + "'", int3 == 85);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = comp5111.assignment.cut.ToolBox.LocaleTools.toLocale("\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rh\rh\ri\r!\r\rh\ri\r!hi!hi!\r\ri\rh\ri\r!\r\rh\ri\r!hi!hi!\r\r!\rh\ri\r!\r\rh\ri\r!hi!hi!\r\rhi!\r \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid locale format: ?h?i?!??h?i?!hi!hi!??h?h?i?!??h?i?!hi!hi!??i?h?i?!??h?i?!hi!hi!??!?h?i?!??h?i?!hi!hi!??h?h?i?!??h?i?!hi!hi!??h?h?i?!??h?i?!hi!hi!??i?h?i?!??h?i?!hi!hi!??!?h?i?!??h?i?!hi!hi!??i?h?i?!??h?i?!hi!hi!??h?h?i?!??h?i?!hi!hi!??i?h?i?!??h?i?!hi!hi!??!?h?i?!??h?i?!hi!hi!??!?h?i?!??h?i?!hi!hi!??h?h?i?!??h?i?!hi!hi!??i?h?i?!??h?i?!hi!hi!??!?h?i?!??h?i?!hi!hi!??hi!? ?");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\n", (int) '\n');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isEmpty((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", 339, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        int int6 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\r \r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r");
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("", pattern1, "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        char[] charArray11 = new char[] { '4' };
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray11);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray11);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray11);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", charArray11);
        int int17 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charArray11);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray11);
        boolean boolean19 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", charArray11);
        boolean boolean20 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", charArray11);
        int int21 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", charArray11);
        int int22 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[4]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", "hi!\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\r \r" + "'", str3, "hi!\r \r");
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        char[] charArray3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r \r");
        int int4 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[\r,  , \r]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", (java.lang.CharSequence) "hi!\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\r \r", true, 399, (java.lang.CharSequence) "hi!\nhi! \r \r", 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray9);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray9);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        int int18 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", "hi!\n\r \r", "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", (java.lang.CharSequence) "hi!\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", false, 15, (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", 15, (-320));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", 411, (-89));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", 93, 354);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (java.lang.CharSequence) "hi!\nhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        long[] longArray6 = new long[] { (-339), 318, 607, (-91), 407, (-406) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-339, 318, 607, -91, 407, -406]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!", pattern1, "hi!\nhi! \r ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        char[] charArray7 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!");
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", charArray7);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[h, i, !]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\nhi! \r", 340, 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!\n\r \r");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "hi!\n\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "hi!\n\r \r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[h, i, !, \n, \r,  , \r]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.ArrayTools.EMPTY_CHAR_ARRAY;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray1);
        java.lang.Class<?> wildcardClass3 = charArray1.getClass();
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        boolean[] booleanArray0 = new boolean[] {};
        boolean boolean1 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean2 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        boolean boolean3 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(booleanArray0);
        java.lang.Object[] objArray4 = new java.lang.Object[] { boolean3 };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(objArray4);
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[true]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", pattern1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r");
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!\n", 15, (-327));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", 335, 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) " ", (-407), (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains(charSequence0, (-407));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", (-52), (-89));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("hi!\nhi!\r \r", "", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi!\nhi!\r \r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi!\nhi!\r \r");
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi!\nhi!\r \r", "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r" + "'", str3, "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r");
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", 0, 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str6 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        char[] charArray3 = new char[] { '4' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray2 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        boolean boolean3 = comp5111.assignment.cut.ToolBox.StringTools.containsNone(charSequence0, charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray5);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        char[] charArray8 = new char[] { '4', '\r' };
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi! \r", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!", charArray8);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charArray8);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r\r \r\r", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4, \r]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (java.lang.CharSequence) "hi!\n\r \r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceFirst("\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", pattern1, "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r");
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!", charArray6);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\n", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi! \r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\r", "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\r" + "'", str3, "\r");
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray8);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!\r \r", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        int int3 = comp5111.assignment.cut.ToolBox.StringTools.compare("hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r", "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \rhi!\r \r", false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-91) + "'", int3 == (-91));
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray4);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) boolean9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi! \rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        char[] charArray5 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "\r");
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) " ", charArray5);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\n", charArray5);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!\nhi!", charArray5);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray5);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "\r");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[\r]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        java.util.regex.Pattern pattern1 = null;
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replaceAll("\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", pattern1, "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r");
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", charArray4);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r", charArray4);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r\nhi! \r", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r", charArray7);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", charArray7);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny(charSequence0, charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        java.lang.String str9 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) " ", charArray9);
        boolean boolean14 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r ", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!hhi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!ihi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!!hi!\nhi!hhi!\nhi!ihi!\nhi!!hi!\nhi!\nhi!\nhi!", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", charArray9);
        boolean boolean18 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r", charArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Argument is not an array");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "\r" };
        java.lang.String str4 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int6 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        int int8 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        java.lang.String str10 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray3);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\n\r \r", charSequence1, (int) '\000');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.lang.CharSequence.toString()\" because \"searchChar\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi! \r ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        double[] doubleArray3 = new double[] { 0.0d, 10L, '\n' };
        boolean boolean4 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean5 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(doubleArray3);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[0.0, 10.0, 10.0]");
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
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isMixedCase((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n\nhi! \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\n");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhi!\r \r", 405, 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", (java.lang.CharSequence) "hi!\n\r \r");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \r\nhi!\r \r\rhi!\r \rhhi!\r \r\rhi!\r \rihi!\r \r\rhi!\r \r!hi!\r \r\rhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \rhhi!\r \rhhi!\r \rihi!\r \r!hi!\r \rihi!\r \rhhi!\r \rihi!\r \r!hi!\r \r!hi!\r \rhhi!\r \rihi!\r \r!hi!\r \r\nhi!\r \r\rhi!\r \r\rhi!\r \r\rhi!\r \r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray6);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("hi!\n\r \r", " ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!\n\r\r" + "'", str3, "hi!\n\r\r");
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        char[] charArray7 = new char[] { '4' };
        boolean boolean8 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray7);
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray7);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray7);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", charArray7);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r", charArray7);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        char[] charArray1 = null;
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean11 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray9);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray9);
        int int13 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", charArray9);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "", charArray9);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\n", charArray9);
        boolean boolean16 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rhi! \r", charArray9);
        boolean boolean17 = comp5111.assignment.cut.ToolBox.StringTools.containsNone((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray4 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray(charSequence3);
        int int5 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\nihi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n!hi!\nhi!hi!\nhhi!\nhi!hi!\nihi!\nhi!hi!\n!hi!\nhi!hi!\n", charArray4);
        boolean boolean6 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\r\r\r", charArray4);
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isNumeric((java.lang.CharSequence) "hi!\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!\n", "hi!\n", "hi!", "hi!hhi!ihi!!hi!", "hi!\n", "hi!" };
        java.lang.String str7 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int8 = comp5111.assignment.cut.ToolBox.ArrayTools.getLength((java.lang.Object) strArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        int int10 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str11 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        int int12 = comp5111.assignment.cut.ToolBox.StringTools.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.String str14 = comp5111.assignment.cut.ToolBox.StringTools.getCommonPrefix(strArray6);
        boolean boolean15 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty((java.lang.Object[]) strArray6);
        java.lang.Class<?> wildcardClass16 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.equals((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r", (java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r\rh\ri\r!\r\n\rh\ri\r!\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\r\r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        boolean boolean1 = comp5111.assignment.cut.ToolBox.StringTools.isAllLowerCase((java.lang.CharSequence) "hi!\nhi! \r \r");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        char[] charArray1 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "hi!hhi!ihi!!hi!hhi!ihi!!hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\nh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r \r");
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        int int1 = comp5111.assignment.cut.ToolBox.StringTools.length((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! hi!\nhi! \r");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        long[] longArray6 = new long[] { (-339), 318, 607, (-91), 407, (-406) };
        boolean boolean7 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(longArray6);
        java.lang.Class<?> wildcardClass8 = longArray6.getClass();
        org.junit.Assert.assertNotNull(longArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(longArray6), "[-339, 318, 607, -91, 407, -406]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!\r \r", (-91), (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        int int2 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\r \r", (java.lang.CharSequence) "hi!hhi!ihi!!hi!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        char[] charArray6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.toCharArray((java.lang.CharSequence) "");
        int int7 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean8 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        int int9 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "hi!hhi!ihi!!hi!", charArray6);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n", charArray6);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r \r", charArray6);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        char[] charArray8 = new char[] { '4' };
        boolean boolean9 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "", charArray8);
        boolean boolean10 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "\r", charArray8);
        int int11 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!hhi!ihi!!hi!\n", charArray8);
        boolean boolean12 = comp5111.assignment.cut.ToolBox.ArrayTools.isEmpty(charArray8);
        boolean boolean13 = comp5111.assignment.cut.ToolBox.StringTools.containsAny((java.lang.CharSequence) "hi!\n\r \r", charArray8);
        int int14 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi!\r \r", charArray8);
        int int15 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAnyBut((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", charArray8);
        int int16 = comp5111.assignment.cut.ToolBox.StringTools.indexOfAny((java.lang.CharSequence) "hi!\nhi! \r", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        java.lang.String str3 = comp5111.assignment.cut.ToolBox.RegExTools.replacePattern("\rh\ri\r!\r\n\rh\ri\r!hi!\n\r \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", " ", "hi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\rh\ri\r!\r\n\rh\ri\r!hi!\n\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n" + "'", str3, "\rh\ri\r!\r\n\rh\ri\r!hi!\n\rhi!hhi!ihi!!hi!\nhhi!hhi!ihi!!hi!\nihi!hhi!ihi!!hi!\n!hi!hhi!ihi!!hi!\n\r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\n\r\rhi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n");
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhi! \r \r", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", (-187), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        boolean boolean6 = comp5111.assignment.cut.ToolBox.CharSequenceTools.regionMatches((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi!\n\r\rhi!hi!hhi!ihi!!\r \r", false, (int) ' ', (java.lang.CharSequence) "hi!hhi!ihi!!hi!\nhi! \r", 0, (-12));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.indexOf((java.lang.CharSequence) "hi!hhi!ihi!!\r \rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\rh\rh\ri\r!\r\n\rh\ri\r!\r \r\r\ri\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r!\rh\ri\r!\r\n\rh\ri\r!\r \r\r\r", (-81), 407);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int int3 = comp5111.assignment.cut.ToolBox.CharSequenceTools.lastIndexOf((java.lang.CharSequence) "\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\rh\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\ri\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r!\rh\ri\r!\r\n\rh\ri\r!hi!\nhi! \r\n\r\r", 13, 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 66 + "'", int3 == 66);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        boolean boolean2 = comp5111.assignment.cut.ToolBox.StringTools.contains((java.lang.CharSequence) "hi!\nhhi!\nihi!\n!hi!\nhhi!\nhhi!\nihi!\n!hi!\nihi!\nhhi!\nihi!\n!hi!\n!hi!\nhhi!\nihi!\n!hi!\n\nhi!\n", 399);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}

