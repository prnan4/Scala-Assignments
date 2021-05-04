/* Scala case objects can be used when creating enumerations. We
use this when we want to creat a trait with fixed/immutable set of objects.

Consider the collowing example where we want to describe the state of TCP/FDP Machine
as connected/disconnected/pending. 
*/

sealed trait State
    case object Disconnected extends State
    case object Connected extends State
    case object Pending extends State

case class TCP (state:State)

/* Now when we want to create a new TCP channel and set its state property, we do the following. */

val TCPchannel1 = new TCP(Connected)

val FDPchannel1 = new TCP(Pending)