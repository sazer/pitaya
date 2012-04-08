/*----------------------------------------------------------------------------*
 * This file is part of Pitaya.                                               *
 * Copyright (C) 2012 Osman KOCAK <kocakosm@gmail.com>                        *
 *                                                                            *
 * This program is free software: you can redistribute it and/or modify it    *
 * under the terms of the GNU Lesser General Public License as published by   *
 * the Free Software Foundation, either version 3 of the License, or (at your *
 * option) any later version.                                                 *
 * This program is distributed in the hope that it will be useful, but        *
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY *
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public     *
 * License for more details.                                                  *
 * You should have received a copy of the GNU Lesser General Public License   *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.       *
 *----------------------------------------------------------------------------*/

package org.pitaya.util;

import static org.junit.Assert.*;

import org.pitaya.charset.ASCII;

import java.util.Random;

import org.junit.Test;

/**
 * Base16 unit tests.
 *
 * @author Osman KOCAK
 */
public final class Base16Test
{
	@Test
	public void testRFC4648TestVectors()
	{
		assertEquals("", Base16.encode(ASCII.encode("")));
		assertEquals("66", Base16.encode(ASCII.encode("f")));
		assertEquals("666F", Base16.encode(ASCII.encode("fo")));
		assertEquals("666F6F", Base16.encode(ASCII.encode("foo")));
		assertEquals("666F6F62", Base16.encode(ASCII.encode("foob")));
		assertEquals("666F6F6261", Base16.encode(ASCII.encode("fooba")));
		assertEquals("666F6F626172", Base16.encode(ASCII.encode("foobar")));
		assertArrayEquals(ASCII.encode("foobar"), Base16.decode("666F6F626172"));
		assertArrayEquals(ASCII.encode("fooba"), Base16.decode("666F6F6261"));
		assertArrayEquals(ASCII.encode("foob"), Base16.decode("666F6F62"));
		assertArrayEquals(ASCII.encode("foo"), Base16.decode("666F6F"));
		assertArrayEquals(ASCII.encode("fo"), Base16.decode("666F"));
		assertArrayEquals(ASCII.encode("f"), Base16.decode("66"));
		assertArrayEquals(ASCII.encode(""), Base16.decode(""));
	}

	@Test
	public void testRandomData()
	{
		Random rnd = new Random();
		for (int i = 0; i < 100; i++) {
			byte[] bytes = new byte[rnd.nextInt(2049)];
			assertArrayEquals(bytes, Base16.decode(Base16.encode(bytes)));
		}
	}
}