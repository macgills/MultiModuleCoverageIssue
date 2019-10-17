package com.example.mylibrary

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LibraryTest {

  @Test
  fun testLibraryObject() {
    assertEquals(5, LibraryObject.testedByLibrary(5))
  }
}
