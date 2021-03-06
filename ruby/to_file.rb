# 믹스인 작성하기 (module 사용)
module ToFile
  def filename
    "object_#{self.object_id}.txt"
  end

  def to_f
    File.open(filename, 'w') {|f| f.write(to_s)}
  end
end

class Person
  include ToFile
  attr_accessor :name

  def initialize(name)
    @name = name 
  end

  def to_s
    name 
  end
end

puts Person.new('mats').to_f