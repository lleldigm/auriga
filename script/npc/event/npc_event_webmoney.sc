//= Athena Script ==============================================================
// Ragnarok Online Web Money Event Script	by AthenaWiki
//= Registry ===================================================================
// WM_EVE -> 0�`1
//==============================================================================
prontera.gat,156,194,4	script	�E�F�u�}�o����	724,{
	if(WM_EVE) {
		mes "[�E�F�u�}�o����]";
		mes "����A���Ȃ��́c�c";
		mes "�����A�E�F�u�}�̎�����";
		mes "�󂩂����̂ˁB";
		next;
		mes "[�E�F�u�}�o����]";
		mes "�����A�킩���Ă��B";
		mes "���Ȃ��͖`���ҁB";
		mes "�{���Ƀs�G���ɂȂ��Ă������";
		mes "�Ȃ��Ƃ������́B";
		next;
		mes "[�E�F�u�}�o����]";
		mes "����̎��́A�S�ĕ��������́B";
		mes "�����o�����畷���Ȃ��l�����A";
		mes "�c�������ɋl�ߊ���āA";
		mes "�Ӓn�ɂȂ��Ă��܂����̂ˁB";
		next;
		mes "[�E�F�u�}�o����]";
		mes "���Ȃ����s�G�������Ɏ󂩂��Ă��ꂽ";
		mes "���A�ŁA�c�������ɋx�݂͏o�����A";
		mes "�����̖ʂ��ۂĂ��Ǝv����B";
		mes "�{���ɂ��肪�Ƃ��B";
		next;
		mes "[�E�F�u�}�o����]";
		mes "�ŁA�����͉��̗p������H";
		mes "���������āu�x�C���X�v�֍s�������́H";
		mes "�Ȃ�A�킩���Ă���ˁc�c";
		mes "������I�@�����I�@����!!";
		next;
		if(select("������","���͂ł���")==2) {
			mes "[�E�F�u�}�o����]";
			mes "���`�I";
			mes "���Ⴀ�A���͂Łu�x�C���X�v�܂�";
			mes "�s���Ē���!!";
			next;
			mes "[�E�F�u�}�o����]";
			mes "���������A�C�X���H�ׂ����";
			mes "�v�����̂Ɂc�c";
			close;
		}
		if(countitem(536) < 10) {
			mes "[�E�F�u�}�o����]";
			mes "�������I";
			mes "�A�C�X�`�A�C�X�`";
			next;
			mes "[�E�F�u�}�o����]";
			mes "���āA����I�@����Ȃ�����Ȃ��I";
			mes "������10�����ė��Ă���";
			mes "�������̂ɁI";
			next;
			mes "[�E�F�u�}�o����]";
			mes "�񑩔j��l�͌�������I";
			mes "�������s���āI";
			mes "�t��!!";
			close;
		}
		mes "[�E�F�u�}�o����]";
		mes "�킠�I�@�A�C�X�I�@�A�C�X�I";
		mes "����ς菋�����́A";
		mes "�A�C�X�N���[���Ɍ���킟�`";
		next;
		mes "[�E�F�u�}�o����]";
		mes "�p�N�p�N���O���O";
		mes "�p�N�p�N���O���O";
		mes "�p�N�p�N���O���O";
		mes "�Ղ͂��I";
		next;
		mes "[�E�F�u�}�o����]";
		mes "����!?";
		mes "����Ȃɂ����؂�ɐH�ׂ���";
		mes "�������󂷂ł����āH";
		next;
		mes "[�E�F�u�}�o����]";
		mes "�S�z�䖳�p!!";
		mes "���ɂ́A�u�S�̈ݑ܁v����";
		mes "�ʖ�������񂾂���I";
		next;
		mes "[�E�F�u�}�o����]";
		mes "���Ⴀ�A�񑩒ʂ�";
		mes "�u�x�C���X�v�܂ő����ˁI";
		mes "���[��!!�@���ł��[�I";
		close2;
		delitem 536,10;
		warp "veins.gat",213,124;
		end;
	}
	mes "[�E�F�u�}�o����]";
	mes "����ɂ��́I";
	mes "���͂v�l�T�[�J�X�̃E�F�u�}�B";
	mes "�l�Ă�ŃE�F�u�}�o�����B";
	next;
	mes "[�E�F�u�}�o����]";
	mes "�T�[�J�X�̌�����";
	mes "�u�x�C���X�v�ɗ����񂾂��ǁA";
	mes "�l���s���Ńs�G���ɂȂ��Ă����l��";
	mes "�T���Ă���Ƃ���Ȃ́B";
	next;
	mes "[�E�F�u�}�o����]";
	mes "���Ȃ��A�s�G���ɂȂ肽������";
	mes "�v�������͂Ȃ��H";
	next;
	mes "[�E�F�u�}�o����]";
	mes "���̒킪�u�x�C���X�v��";
	mes "�s�G���̎��������邩�ǂ���";
	mes "���������Ă���񂾂��ǁA";
	mes "���Ȃ����`�������W���Ă݂Ȃ��H";
	next;
	if(select("�`�������W����I","�`�������W���Ȃ�")==2) {
		mes "[�E�F�u�}�o����]";
		mes "������!?";
		mes "�s�G���ɋ������Ȃ��́H";
		next;
		mes "[�E�F�u�}�o����]";
		mes "����Ȃɑf�G�ȐE�Ƃ́A";
		mes "���X�Ȃ��Ǝv���񂾂��ǁc�c";
		mes "�������Ȃ��Ȃ�d���Ȃ���ˁB";
		mes "�{���Ɏc�O����c�c";
		next;
		mes "[�E�F�u�}�o����]";
		mes "�����A��������������b�����ĂˁB";
		mes "�Z�����Ԃ����ǁA�����ɂ����B";
		mes "���ꂶ�Ⴀ�ˁB";
		close;
	}
	mes "[�E�F�u�}�o����]";
	mes "�{��!?";
	mes "�T�[�J�X�c���Ė{���ɑf�G��I";
	mes "���E�����^�_�ŗ����鎖���o���āA";
	mes "���q�l����͖����̔���c�c�i�����Ƃ�";
	next;
	mes "[�E�F�u�}�o����]";
	mes "�n�b!?";
	mes "�����Ȃ��I�@�܂������̐��E�Ɂc�c";
	next;
	mes "[�E�F�u�}�o����]";
	mes "�����I�@���ł��Ȃ���I�@�z�z�z";
	mes "���`���ƁA�s�G�������̎���������ˁI";
	mes "�悩������A�������ځu�x�C���X�v�܂�";
	mes "�����Ă�������B";
	next;
	mes "[�E�F�u�}�o����]";
	mes "�ł��A�^�_���Ė�ɂ͂����Ȃ���I";
	mes "�������܂Ńx�C���X�ɂ������񂾂���";
	mes "�����Ă��傤���Ȃ��́c�c";
	next;
	mes "[�E�F�u�}�o����]";
	mes "���̑�D���ȁu�A�C�X�N���[���v��";
	mes "10����Ȃ�������B";
	next;
	if(select("������","���͂ł���")==2) {
		mes "[�E�F�u�}�o����]";
		mes "���`�I";
		mes "���Ⴀ�A���͂Łu�x�C���X�v�܂�";
		mes "�s���Ē���!!";
		next;
		mes "[�E�F�u�}�o����]";
		mes "���������A�C�X���H�ׂ����";
		mes "�v�����̂Ɂc�c";
		close;
	}
	if(countitem(536) < 10) {
		mes "[�E�F�u�}�o����]";
		mes "�������I";
		mes "�A�C�X�`�A�C�X�`";
		next;
		mes "[�E�F�u�}�o����]";
		mes "���āA����I�@����Ȃ�����Ȃ��I";
		mes "������10�����ė��Ă���";
		mes "�������̂ɁI";
		next;
		mes "[�E�F�u�}�o����]";
		mes "�񑩔j��l�͌�������I";
		mes "�������s���āI";
		mes "�t��!!";
		close;
	}
	mes "[�E�F�u�}�o����]";
	mes "�킠�I�@�A�C�X�I�@�A�C�X�I";
	mes "����ς菋�����́A";
	mes "�A�C�X�N���[���Ɍ���킟�`";
	next;
	mes "[�E�F�u�}�o����]";
	mes "�p�N�p�N���O���O";
	mes "�p�N�p�N���O���O";
	mes "�p�N�p�N���O���O";
	mes "�Ղ͂��I";
	next;
	mes "[�E�F�u�}�o����]";
	mes "����!?";
	mes "����Ȃɂ����؂�ɐH�ׂ���";
	mes "�������󂷂ł����āH";
	next;
	mes "[�E�F�u�}�o����]";
	mes "�S�z�䖳�p!!";
	mes "���ɂ́A�u�S�̈ݑ܁v����";
	mes "�ʖ�������񂾂���I";
	next;
	mes "[�E�F�u�}�o����]";
	mes "���Ⴀ�A�񑩒ʂ�";
	mes "�u�x�C���X�v�܂ő����ˁI";
	mes "���[��!!�@���ł��[�I";
	close2;
	delitem 536,10;
	warp "veins.gat",213,124;
	end;
}

veins.gat,213,129,4	script	�E�F�u�}��	715,{
	if(WM_EVE) {
		mes "[�E�F�u�}��]";
		mes "�����A�L�~���c�c";
		mes "�v�����e���ɑ����ė~�����̂����H";
		next;
		if(select("�����Ă��炤","�߂�Ȃ�")==2) {
			mes "[�E�F�u�}��]";
			mes "�{���ɖ߂�Ȃ��́H";
			mes "����ȏ������̂ǂ��������̂��c�c";
			next;
			mes "[�E�F�u�}��]";
			mes "�X�̂����߂��ɂ���g�[���ΎR�ɂ�";
			mes "���ɂ����낵��������������Ęb����";
			mes "�����Ƃ��V�����s�G����T���o����";
			mes "���̌����n�ɍs�������Ȃ��c�c";
			close;
		}
		mes "[�E�F�u�}��]";
		mes "���������B";
		mes "����ȏ��������A";
		mes "��΂������̕���������c�c";
		next;
		mes "[�E�F�u�}��]";
		mes "�������ɂ͎o���񂪂���͂�������";
		mes "��낵���`���Ă����āB";
		mes "���Ⴀ�A���ł��`";
		close2;
		warp "prontera.gat",156,191;
		end;
	}
	mes "[�E�F�u�}��]";
	mes "���`�����c�c";
	mes "�����́A�{���ɏ����˂��c�c";
	next;
	if(select("�����I","�����͓̂��ӂ��I")==2) {
		mes "[�E�F�u�}��]";
		mes "�������c�c";
		mes "�{�N�̓s�G��������";
		mes "��ɉ��ς�����ł��傤�H";
		mes "���ꂪ�A�܂������񂾂�c�c";
		next;
		mes "[�E�F�u�}��]";
		mes "���������΁A���ς��������Ⴄ��";
		mes "����������Ċ���@���₵�Ȃ��B";
		next;
		mes "[�E�F�u�}��]";
		mes "�o����́A";
		mes "�u�S���ŋp����΁`�v�Ȃ�Č������ǁA";
		mes "�����́A�������i�D��";
		mes "�󒆃u�����R�ŃX�C�X�`�C���Ă��B";
		mes "�u�c�u�c�c�c";
		next;
		mes "[�E�F�u�}��]";
		mes "�n�b!?";
		mes "�ƁA�Ƃɂ��������͏��������B";
		mes "�����ʂ̌����n�ɍs�������Ȃ��c�c";
		close;
	}
	mes "[�E�F�u�}��]";
	mes "����˂��c�c";
	mes "�{�N��͑����̍�����";
	mes "�����˗����󂯂ė����񂾂���";
	mes "�������������ŁA�F�s�������I";
	mes "�X�g���C�L���N����������Ă��`";
	next;
	mes "[�E�F�u�}��]";
	mes "������c�c�A����Ȃ�����";
	mes "�E�F�u�}�[�j�c����";
	mes "�u�V�����c�����X�J�E�g���Ă��Ȃ���";
	mes "�F�ɋx�ɂ͂���I�v�Ȃ��";
	mes "�Ӓn�ɂȂ�������āc�c";
	next;
	mes "[�E�F�u�}��]";
	mes "���A�ŁA���̏��`���X�ő��~�߁B";
	mes "�d���Ȃ��c���ɂȂ��Ă����";
	mes "�`���҂�T���Ă���񂾁B";
	next;
	mes "[�E�F�u�}��]";
	mes "�����I";
	mes "���ȏЉ�܂��������ˁB";
	mes "�{�N�̖��O�̓E�F�u�}���I";
	mes "�v�l�T�[�J�X�c�ŁA";
	mes "�s�G��������Ă���񂾁I";
	next;
	mes "[�E�F�u�}��]";
	mes "�L�~�́A����������";
	mes "�s�G���ɂȂ鎎�����󂯂ɗ���";
	mes "�`���҂̐l�H";
	next;
	if(select("������","�Ⴄ")==2) {
		mes "[�E�F�u�}��]";
		mes "�������c�c";
		mes "�{�N�̎o���񂪁A�v�����e���̊X��";
		mes "�s�G���ɂȂ��Ă����l��T����";
		mes "����͂��Ȃ񂾂��ǁc�c";
		next;
		mes "[�E�F�u�}��]";
		mes "�o����̖��O�́A";
		mes "�E�F�u�}���Č����񂾁B";
		mes "���������Ȃ������H";
		next;
		mes "[�E�F�u�}��]";
		mes "�O���H�@�������Ȃ��c�c";
		mes "���l�����ǁA�L�c�����ȁc�c";
		mes "���炢�ŁA�Q���̈����c�c";
		next;
		mes "[�E�F�u�}��]";
		mes "�����I";
		mes "�{�N������Ȏ��������Ă��̂�";
		mes "��΁I�@�������`���I�@�閧�ɂ��ĂˁI";
		next;
		mes "[�E�F�u�}��]";
		mes "���c�����A�悩������";
		mes "�v�����e���܂ő��邩��A";
		mes "�o����ɉ���Ă݂Ă�I";
		next;
		if(select("�����Ă��炤","�߂�Ȃ�")==2) {
			mes "[�E�F�u�}��]";
			mes "�{���ɖ߂�Ȃ��́H";
			mes "����ȏ������̂ǂ��������̂��c�c";
			next;
			mes "[�E�F�u�}��]";
			mes "�X�̂����߂��ɂ���g�[���ΎR�ɂ�";
			mes "���ɂ����낵��������������Ęb����";
			mes "�����Ƃ��V�����s�G����T���o����";
			mes "���̌����n�ɍs�������Ȃ��c�c";
			close;
		}
		mes "[�E�F�u�}��]";
		mes "���������B";
		mes "����ȏ��������A";
		mes "��΂������̕���������c�c";
		next;
		mes "[�E�F�u�}��]";
		mes "�������ɂ͎o���񂪂���͂�������";
		mes "��낵���`���Ă����āB";
		mes "���Ⴀ�A���ł��`";
		close2;
		warp "prontera.gat",156,191;
		end;
	}
	mes "[�E�F�u�}��]";
	mes "��!?";
	mes "�{���ɖ{���H";
	next;
	mes "[�E�F�u�}��]";
	mes "���肪�Ƃ��I";
	mes "���̍��̐l�����́A";
	mes "�F�Ί�Ɉ��Ă��邩��";
	mes "��΃s�G���Ɍ����Ă���Ǝv���񂾁I";
	next;
	mes "[�E�F�u�}��]";
	mes "�s�G�����āA�l�Ɋy�����v����";
	mes "�v���[���g����E�Ƃ�����ˁI";
	next;
	mes "[�E�F�u�}��]";
	mes "�����A���ƈ�I";
	mes "�s�G���ɂȂ�ɂ͑�؂Ȕ\�͂�";
	mes "����񂾁I";
	next;
	mes "[�E�F�u�}��]";
	mes "���̑�؂Ȕ\�͂Ƃ́c�c";
	mes "������!";
	mes "�����A����������A�������Ċ����āc�c";
	mes "�������ǁA�\�͂�������O��";
	mes "�����S�W���[�X��10����Ȃ��H";
	next;
	if(select("������","�����Ȃ�")==2) {
		mes "[�E�F�u�}��]";
		mes "�����`";
		mes "����ȂɍA�������Ă���̂Ɂc�c";
		mes "�n�鐢�Ԃ͋S�͂Ȃ��A���Č�������";
		mes "�����ł��Ȃ��񂾂ˁc�c";
		mes "����ڂڂځ`��";
		close;
	}
	if(countitem(531) < 10) {
		mes "[�E�F�u�}��]";
		mes "������I�@������I";
		mes "�����S�W���[�X�I�@�����S�W���[�X�I";
		next;
		mes "[�E�F�u�}��]";
		mes "���āA������I�@����Ȃ�����Ȃ����I";
		mes "������10�����ė��Ă���";
		mes "�������̂ɁI";
		next;
		mes "[�E�F�u�}��]";
		mes "�񑩔j��l�͌���������I";
		mes "�������s���āI";
		mes "�t��!!";
		close;
	}
	mes "[�E�F�u�}��]";
	mes "�킠�I�@�W���[�X�I�@�W���[�X�I";
	mes "����ς菋������";
	mes "�����S�W���[�X�Ɍ���Ȃ��`";
	next;
	mes "[�E�F�u�}��]";
	mes "�S�N�S�N�S�N�S�N";
	mes "�S�N�S�N�S�N�S�N";
	mes "�S�N�S�N�S�N�S�N";
	mes "�Ղ͂��I";
	next;
	mes "[�E�F�u�}��]";
	mes "��!?";
	mes "����Ȃɂ����؂�Ɉ��񂾂�";
	mes "�������󂷂��āH";
	next;
	mes "[�E�F�u�}��]";
	mes "�S�z�㖳�p�I";
	mes "�{�N�ɂ́A�u�S�̈ݑ܁v����";
	mes "�ʖ�������񂾁I";
	next;
	mes "[�E�F�u�}��]";
	mes "�ŁA���̘b�������c�c�H";
	mes "���I�@��������";
	mes "�s�G���ɂȂ�̂�";
	mes "��؂Ȕ\�̘͂b��������ˁB";
	next;
	mes "[�E�F�u�}��]";
	mes "����́A�Y�o��!!";
	mes "����̐l�������l���Ă��邩";
	mes "�@�m����\�́I";
	next;
	mes "[�E�F�u�}��]";
	mes "����̍l���Ă��鎖���@�m�ł��Ȃ���";
	mes "������΂킹�鎖���ł��Ȃ��ł���H";
	next;
	mes "[�E�F�u�}��]";
	mes "�����̓��e�͊ȒP���I";
	mes "�{�N�Ƃ���񂯂񂵂ď��Ă�";
	mes "�L�~�͍��i�B";
	mes "�ˁH�@�ȒP����H";
	next;
	mes "[�E�F�u�}��]";
	mes "�{�N�̍l����ǂ�ŁA";
	mes "����񂯂�ɏ������ł�����";
	mes "�s�G���̏؂ł���u�����t�̖X�q�v��";
	mes "�L�~�Ƀv���[���g�����I";
	next;
	mes "[�E�F�u�}��]";
	mes "�����`���I";
	mes "����񂯂�ɏ������Ƃ��Ă�";
	mes "�ו��̗ʂ�����������A";
	mes "�d�ʂɖ�肪��������";
	mes "�u�����t�̖X�q�v�͓n���Ȃ���H";
	next;
	if(select("���v�I","�o����")==2) {
		mes "[�E�F�u�}��]";
		mes "�������ˁB";
		mes "�����ɏ������Ƃ��Ă�";
		mes "�u�����t�̖X�q�v���������Ȃ��̂�";
		mes "�{�N�Ƃ��Ă��₵�����B";
		next;
		mes "[�E�F�u�}��]";
		mes "�������ǁA�q�ɂɗa����Ȃ�";
		mes "�J�[�g�ɓ����Ȃ肵��";
		mes "�d�ʂƌ��𒲐����ė��Ă�B";
		close;
	}
	delitem 531,10;
	mes "[�E�F�u�}��]";
	mes "���Ⴀ�A���������n�߂��!!";
	mes "�ŏ��́A�O�[�I";
	mes "����񂯁[��ہ[��!!";
	next;
	menu "���[",-,"���傫",-,"�ρ[",-;
	switch(rand(3)) {
	case 0:
		mes "[�E�F�u�}��]";
		mes "��[���I�@�������I�@�������I";
		mes "�c�O�����ǁA���ꂶ�Ⴀ";
		mes "�u�����t�̖X�q�v�́A";
		mes "�������Ȃ��Ȃ��B";
		next;
		mes "[�E�F�u�}��]";
		mes "�������ǁA�܂����킵�Ă���I";
		mes "�n�b�n�b�n�`";
		close;
	case 1:
		mes "[�E�F�u�}��]";
		mes "����[�I";
		mes "��������!?";
		next;
		mes "[�E�F�u�}��]";
		mes "�c�O�����ǁA��������";
		mes "�������Ď��ɂȂ��Ă�񂾁c�c";
		mes "���߂�ˁB";
		mes "�܂��A�`�������W���Ă���I";
		close;
	case 2:
		mes "[�E�F�u�}��]";
		mes "��������`";
		mes "��������������[";
		mes "���\�A�{�C�������񂾂��ǁB";
		next;
		mes "[�E�F�u�}��]";
		mes "�ǂ����L�~�ɂ́A";
		mes "�V���̍˔\������悤���˂��I";
		mes "�����A�s�G���ɂȂ�˔\�����I";
		next;
		mes "[�E�F�u�}��]";
		mes "���Ⴀ�A�񑩒ʂ�";
		mes "�u�����t�̖X�q�v���������`";
		next;
		mes "[�E�F�u�}��]";
		mes "�����I";
		mes "���ꂪ�񑩂́u�����t�̖X�q�v����I";
		mes "����ŌN�����h�ȃs�G�����I";
		set WM_EVE,1;
		getitem 5150,1;
		close;
	}
}

veins.gat,215,140,4	script	�E�F�u�}�[�j�c��	853,{
	if(WM_EVE) {
		mes "[�E�F�u�}�[�j�c��]";
		mes "�₠�₠�I";
		mes "�L�~�������ŐV����";
		mes "�����Ă����l���ˁH";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "�Ȃ�قǁI�@�Ȃ�قǁI";
		mes "�m���Ƀs�G��������";
		mes "������Ƃ�킢�I";
		mes "�����I�@����Ꮈ�h�B";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "[" +strcharinfo(0)+ "]";
		mes "�ƌ��������ˁH";
		mes "����́A�c�������ɂ�";
		mes "�����ɂ��ė~�����񂾂��c�c";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "���́A�V�����c����������Ȃ��Ă�";
		mes "�c�������ɂ�";
		mes "�x�݂���������肾�����񂾁c�c";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "���茾�t�ɔ������t�ŁA";
		mes "�X�g���C�L���n�߂��c�������̎�O";
		mes "�f���ɋx�݂���鎖��";
		mes "�ł��Ȃ��Ȃ��Ă��܂��Ăȁc�c";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "�L�~�����q�̎����Ɏ󂩂���";
		mes "�s�G���Ƃ��ĔF�߂�ꂽ���_��";
		mes "���V�Ƃ��Ă��ʎq���������I";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "�{���A�`���҂ł���L�~��";
		mes "�e�ؐS���炩�A�������󂯂Ă��ꂽ��";
		mes "���ۂɃs�G���Ƃ��ē�����ɂ�";
		mes "�����񂾂낤�H";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "����Ɍ����Ă͉������A";
		mes "�`���҂Ƃ��Ă̓v���ł�";
		mes "�ȒP�ȃe�X�g���N���A�����ʂ���";
		mes "���X�A�����̒c���ɂ͂Ȃ�Ȃ���B";
		next;
		mes "[�E�F�u�}�[�j�c��]";
		mes "�c�������ɂ́A�񑩒ʂ�x�݂���邩��";
		mes "���S���Ă���I";
		mes "���͂��Ă���āA���肪�Ƃ��I";
		mes "���ꂶ�Ⴀ�I";
		close;
	}
	mes "[�E�F�u�}�[�j�c��]";
	mes "�c���������X�g���C�L���n�߂Ă��܂���";
	mes "�����X�P�W���[�����A���`���N�`�����I";
	mes "�����`��B�������c�c";
	next;
	mes "[�E�F�u�}�[�j�c��]";
	mes "��H�@�����̃L�~�I";
	mes "�s�G���ɂȂ��Đ��E���̂��q�l��";
	mes "���΂̉Q�Ɋ�������ł݂Ȃ����H";
	close;
}

veins.gat,212,144,4	script	�c���E�H���b�g	122,{
	if(WM_EVE) {
		mes "[�c���E�H���b�g]";
		mes "�����I�@���Ȃ����V����";
		mes "�c���̕��ł��ȁH";
		mes "���Ȃ��̂��A�ŁA";
		mes "����Ƌx�ɂ����炦�܂���`";
		mes "���肪�Ƃ��������܂��I";
		next;
		mes "[�c���E�H���b�g]";
		mes "�ό������悤���A";
		mes "�o�J���X�ɍs������";
		mes "�����܂��ˁ`";
		close;
	}
	mes "[�c���E�H���b�g]";
	mes "�����c�c";
	mes "�A��ꂽ�c�c";
	next;
	mes "[�c���E�H���b�g]";
	mes "���������ŁA�̂̓{���{��";
	mes "���낻��x�ɂ���Ȃ���";
	mes "����Ă��Ȃ��ł���B";
	next;
	mes "[�c���E�H���b�g]";
	mes "�c���ɒ��k�����Ă�";
	mes "�u���̌������I�������I�v";
	mes "�̈�_����B";
	next;
	mes "[�c���E�H���b�g]";
	mes "���̐l�́A�������̋�J��";
	mes "�S�R�킩���ĂȂ��I";
	mes "�������`";
	close;
}

veins.gat,215,145,4	script	�c���I�e�K��	845,{
	if(WM_EVE) {
		mes "[�c���I�e�K��]";
		mes "����!?";
		mes "���Ȃ����V�����c���H";
		mes "���Ȃ��̂��A�ł����";
		mes "�������o�����B";
		next;
		mes "[�c���I�e�K��]";
		mes "���ꂩ��́A�c����";
		mes "����I�ɋx�݂�����邻����B";
		mes "�F���Ȃ��̂��A�ˁI";
		mes "�{���ɂ��肪�Ƃ��I";
		close;
	}
	mes "[�c���I�e�K��]";
	mes "�͂��c�c";
	mes "������������������";
	mes "���Ȃ����Ⴄ�I";
	next;
	mes "[�c���I�e�K��]";
	mes "����Ⴀ�A�������̓v��������";
	mes "�ǂ�Ȃɔ��Ă��Ă�";
	mes "���q�l�ɂ͏Ί��U��܂���I";
	next;
	mes "[�c���I�e�K��]";
	mes "�ł��A�������͋@�B����Ȃ��̂�I";
	mes "�c���ɂ͕Ԃ��Ȃ����̉������邯��";
	mes "����΂���́A�ނ��Ȃ���I";
	close;
}

veins.gat,211,140,4	script	�c���`���[����	806,{
	if(WM_EVE) {
		mes "[�c���`���[����]";
		mes "���ق��I";
		mes "���傪�A�V�����c�����H";
		next;
		mes "[�c���`���[����]";
		mes "����ŃE�F�u�}�[�j�c����";
		mes "�񑩒ʂ�A";
		mes "���V��ɋx�݂�����邶��낤�I";
		mes "���肪�Ƃ��I�@���肪�Ƃ��I";
		next;
		mes "[�c���`���[����]";
		mes "��`���ƁA�������ꏊ��";
		mes "�o�J���X���y���߂邼���I";
		next;
		mes "[�c���`���[����]";
		mes "��̊X���e�B�G�ɍs����";
		mes "��Ă̓��W�����C�ɍs����";
		mes "�����̂��`";
		mes "�t�H�b�t�H�b�t�H!!";
		close;
	}
	mes "[�c���`���[����]";
	mes "�����c�c";
	mes "�X�g���C�L�ɓ������͂������A";
	mes "�]��̏����ɖ{����";
	mes "�����Ȃ��Ȃ��Ă��܂��Ắc�c";
	next;
	mes "[�c���`���[����]";
	mes "�N�͎�肽���Ȃ����񂶂�B";
	mes "�����V�����c����������";
	mes "�������ꏊ�ŋx�݂����̂��c�c";
	close;
}