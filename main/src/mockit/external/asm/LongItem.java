package mockit.external.asm;

import javax.annotation.*;

import static mockit.external.asm.ConstantPoolGeneration.ItemType.*;

final class LongItem extends Item
{
   LongItem(@Nonnegative int index) {
      super(index);
      type = LONG;
   }

   LongItem(@Nonnegative int index, @Nonnull LongItem item) {
      super(index, item);
   }

   /**
    * Sets the value of this item.
    */
   void set(long value) {
      longVal = value;
      setHashCode((int) value);
   }
}