package org.jeffpiazza.derby.gui;

import org.jeffpiazza.derby.TimerDevice;

public class TimerClassListElement {
  private Class<? extends TimerDevice> type;

  public TimerClassListElement(Class<? extends TimerDevice> type) {
    this.type = type;
  }

  public Class<? extends TimerDevice> type() {
    return type;
  }

  public String toString() {
    return type.getSimpleName();
  }
}
