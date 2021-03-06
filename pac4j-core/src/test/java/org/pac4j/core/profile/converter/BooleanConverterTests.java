package org.pac4j.core.profile.converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class tests the {@link BooleanConverter} class.
 * 
 * @author Jerome Leleu
 * @since 1.1.0
 */
public final class BooleanConverterTests {
    
    private final BooleanConverter converter = new BooleanConverter();

    @Test
    public void testNull() {
        assertNull(this.converter.convert(null));
    }

    @Test
    public void testNotAStringNotABoolean() {
        assertNull(this.converter.convert(1));
    }

    @Test
    public void testBooleanFalse() {
        assertEquals(Boolean.FALSE, this.converter.convert(Boolean.FALSE));
    }

    @Test
    public void testBooleanTrue() {
        assertEquals(Boolean.TRUE, this.converter.convert(Boolean.TRUE));
    }

    @Test
    public void testFalse() {
        assertEquals(Boolean.FALSE, this.converter.convert("false"));
    }

    @Test
    public void testTrue() {
        assertEquals(Boolean.TRUE, this.converter.convert("true"));
    }
}
