package models

import lib.Datatype

sealed trait Container {
    def multiple: Boolean
}

object Container {

  case object Singleton extends Container {
    override def multiple = false
  }

  case object Option extends Container {
    override def multiple = false
  }

  case object List extends Container {
    override def multiple = false
  }

  case object Map extends Container {
    override def multiple = false
  }


  def apply(dt: Datatype): Container = {
    dt match {
      case Datatype.Singleton(_) => Singleton
      case Datatype.Option(_) => Option
      case Datatype.List(_) => List
      case Datatype.Map(_) => Map
    }
  }

}

