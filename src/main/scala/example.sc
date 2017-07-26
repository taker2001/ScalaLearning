def sum(xs: List[Int]): Int =
  if (xs.length == 1) xs.head else sum(xs.tail) + xs.head

def max(xs: List[Int]): Int = {
  if (xs.isEmpty) throw new java.util.NoSuchElementException
  if (xs.size == 1) xs.head
  else if (xs.head > max(xs.tail)) xs.head else max(xs.tail)
}

def min(xs: List[Int]): Int = {
  if (xs.isEmpty) throw new java.util.NoSuchElementException
  if (xs.size == 1) xs.head
  else if (xs.head < min(xs.tail)) xs.head else min(xs.tail)
}

def reverse(xs: String): String =
  if (xs.length == 1) xs else reverse(xs.tail) + xs.head

sum(List(0))
max(List(1,2,31,4,21,1,0))
min(List(1,2,31,4,21,1,0,-9))
reverse("MUREX")
reverse("M")
