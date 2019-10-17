package com.example.multimodulecoverage

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.mylibrary.LibraryObject
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AppTest {

  @Test
  fun testLibraryObject() {
    assertEquals(5, LibraryObject.testedByApp(5))
  }
}
