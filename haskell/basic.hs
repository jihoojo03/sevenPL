double x = x + x
quadruple x = double (double x)

factorial :: Integer -> Integer
factorial x
  | x > 1 = x * factorial(x-1)
  | otherwise = 1

main = do
  putStrLn "Hello, World"
  print (double 10)
  print (factorial 5)