// Copyright (C) 2003,2004 by Object Mentor, Inc. All rights reserved.
// Released under the terms of the GNU General Public License version 2 or later.
package fitnesse.authentication;

import fitnesse.wiki.*;

public class SecureWriteOperation extends SecurePageOperation
{
  protected String getSecurityMode()
  {
    return WikiPage.SECURE_WRITE;
  }
}